package io.betterbanking.service;

import io.betterbanking.entity.Transaction;
import io.betterbanking.repository.MerchantDetailsRepository;
import io.betterbanking.repository.TransactionApiClientWrapper;
import io.betterbanking.repository.TransactionRepository;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TransactionService {

    private final TransactionApiClientWrapper clientWrapper;
    private final MerchantDetailsRepository merchantDetailsRepository;
    private final TransactionRepository transactionRepository;

    public TransactionService(
            final TransactionApiClientWrapper clientWrapper,
            final MerchantDetailsRepository merchantDetailsRepository,
            final TransactionRepository transactionRepository) {

        this.clientWrapper = clientWrapper;
        this.merchantDetailsRepository = merchantDetailsRepository;
        this.transactionRepository = transactionRepository;
    }

    @PostFilter("hasAuthority(filterObject.accountNumber.toString())")
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) throws Exception {

        // Call the wrapper. If port 8081 is down, it triggers fallback internally and returns DB data
        List<Transaction> transactions = clientWrapper.fetchRemoteTransactions(accountNumber);

        // Enrich the data
        transactions.forEach(transaction -> {
            merchantDetailsRepository
                    .findMerchantLogo(transaction.getMerchantName())
                    .ifPresent(transaction::setMerchantLogo);
        });

        return transactions;
    }
}

//    @PostFilter(value = "hasAuthority(filterObject.accountNumber.toString())")
//    @CircuitBreaker(name = "transactionService", fallbackMethod = "findAllByAccountNumberFallback")
//    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) throws Exception {
//        var transactions = transactionApiClient.findAllByAccountNumber(accountNumber);
//        transactions.forEach(transaction -> {
//            merchantDetailsRepository
//                    .findMerchantLogo(transaction.getMerchantName())
//                    .ifPresent(logo ->
//                            transaction.setMerchantLogo(logo)
//                    );
//        });
//
//        return transactions;
//    }

//    public List<Transaction> findAllByAccountNumberFallback(final Integer accountNumber, final Throwable throwable) {
//        log.info("falling back to database to get transactions");
//        return transactionRepository.findAllByAccountNumber(accountNumber);
//    }

