package io.betterbanking.repository;

import io.betterbanking.service.TransactionService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import io.betterbanking.entity.Transaction;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class TransactionApiClientWrapper {

    private final TransactionApiClient transactionApiClient;
    private final TransactionRepository transactionRepository;
    private final TransactionService transactionService;

    @CircuitBreaker(name = "transactionService", fallbackMethod = "apiFallback")
    public List<Transaction> fetchRemoteTransactions(final Integer accountNumber) throws Exception {
        return transactionApiClient.findAllByAccountNumber(accountNumber);
    }

    // This handles the connection error cleanly
    public List<Transaction> apiFallback(final Integer accountNumber, final Throwable throwable) {
        log.info("Circuit breaker caught connection error: {}", throwable.getMessage());
        log.info("falling back to database to get transactions");

        // Return your local DB backup
        return transactionService.pollByAccountNumber(accountNumber);
    }
}
