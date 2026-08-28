package io.betterbanking.service;

import io.betterbanking.entity.Transaction;
import io.betterbanking.repository.MerchantDetailsRepository;
import io.betterbanking.repository.TransactionApiClient;
import io.betterbanking.repository.TransactionApiClientWrapper;
import io.betterbanking.repository.TransactionRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

@Slf4j
@Service
public class TransactionService {

    private final TransactionApiClient transactionApiClient;
    private final MerchantDetailsRepository merchantDetailsRepository;
    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(
            final TransactionApiClient transactionApiClient,
            final MerchantDetailsRepository merchantDetailsRepository,
            final TransactionRepository transactionRepository) {

        this.transactionApiClient = transactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
        this.transactionRepository = transactionRepository;
    }

    @Scheduled(cron = "${io.betterbanking.integration.scheduled.poll}")
    public void poll() {
        log.info("started polling for new transactions");
        transactionRepository.findAllAccountNumbers().forEach(this::pollByAccountNumber);
        log.info("finished polling for new transactions");
    }

    @Cacheable(cacheNames = "transactions")
    @PostFilter("hasAuthority(filterObject.accountNumber.toString())")
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) throws Exception {

        // Call the wrapper. If port 8081 is down, it triggers fallback internally and returns DB data
        List<Transaction> transactions = fetchRemoteTransactions(accountNumber);

        // Enrich the data
        transactions.forEach(transaction -> {
            merchantDetailsRepository
                    .findMerchantLogo(transaction.getMerchantName())
                    .ifPresent(transaction::setMerchantLogo);
        });

        return transactions;
    }

    @CircuitBreaker(name = "transactionService", fallbackMethod = "apiFallback")
    public List<Transaction> fetchRemoteTransactions(final Integer accountNumber) throws Exception {
//        return transactionRepository.findAllByAccountNumber(accountNumber);
        return transactionApiClient.findAllByAccountNumber(accountNumber);
    }

    public List<Transaction> apiFallback(final Integer accountNumber, final Throwable throwable) {
        log.info("Circuit breaker caught connection error: {}", throwable.getMessage());
        log.info("falling back to get remote transactions");

        // Return your local DB backup
//        return pollByAccountNumber(accountNumber);
        log.info("falling back to database to get transactions");
        return transactionRepository.findAllByAccountNumber(accountNumber);
    }

    public List<Transaction> pollByAccountNumber(final Integer accountNumber) {

        List<Transaction> transactions = getRemoteTransactionList(accountNumber); // get transactions in real-time from the acme server
        transactions.forEach(transaction ->
                merchantDetailsRepository
                        .findMerchantLogo(transaction.getMerchantName())
                        .ifPresent(transaction::setMerchantLogo)
        );
        var stored = transactionRepository.findAllByAccountNumber(accountNumber); // get transactions from the database

        var toStore = transactions
                .stream()
                .filter(t -> !stored.contains(t))
                .collect(toList()); // compare and add the missing transactions in the database

        transactionRepository.saveAll(toStore);
        return transactions;
    }

    private List<Transaction> getRemoteTransactionList(final Integer accountNumber) {
        log.info("attempting to get transactions from remote service");
        try {
            var ts = transactionApiClient.findAllByAccountNumber(accountNumber);
            log.info("returned {} transactions from remote service", ts.size());
            return ts;
        } catch (Exception ex) {
            log.error("error generated when attempting to get transactions from remote service", ex);
            return emptyList();
        }
    }
}


