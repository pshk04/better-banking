package io.service;

import io.BetterBankingApplication;
import io.betterbanking.entity.Transaction;
import io.betterbanking.repository.TransactionRepository;
import io.betterbanking.service.TransactionService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.List;


@SpringBootTest(classes = {BetterBankingApplication.class})
public class TransactionServiceTest {
    @Mock
    private TransactionRepository transactionRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void verifyTransactionsCount(){

        when(transactionRepository.findAllByAccountNumber(anyInt())).thenReturn(transactions());

        TransactionService transactionService = new TransactionService(transactionRepository);
        List<Transaction> userTransactions = transactionService.findAllByAccountNumber(1);

        assertEquals(1, userTransactions.size());

    }
    private List<Transaction> transactions() {
        return List.of(
                Transaction
                        .builder()
                        .type("credit")
                        .date(new Date())
                        .accountNumber(1)
                        .currency("USD")
                        .amount(100.00)
                        .merchantName("acme")
                        .merchantLogo("images/acme-logo.png")
                        .build()
        );
    }
}
