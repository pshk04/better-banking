package io.betterbanking.service;

import io.betterbanking.entity.Transaction;
import io.betterbanking.repository.MerchantDetailsRepository;
import io.betterbanking.repository.TransactionApiClient;
import io.betterbanking.repository.TransactionRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TransactionService {

    private final TransactionApiClient transactionApiClient;
    private final MerchantDetailsRepository merchantDetailsRepository;
    private final TransactionRepository transactionRepository;

    public TransactionService(
            final TransactionApiClient transactionApiClient,
            final MerchantDetailsRepository merchantDetailsRepository,
            final TransactionRepository transactionRepository) {
        this.transactionApiClient = transactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
        this.transactionRepository = transactionRepository;
    }

//    @CircuitBreaker(name = "transactionService", fallbackMethod = "findAllByAccountNumber")
//    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) throws Exception{
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

    // final Throwable throwable
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) throws Exception{
        log.info("falling back to database to get transactions");
        return transactionRepository.findAllByAccountNumber(accountNumber);
    }
}
