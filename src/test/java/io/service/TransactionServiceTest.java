package io.service;

import io.betterbanking.entity.Transaction;
import io.betterbanking.service.TransactionService;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TransactionServiceTest {

    @Test
    void getTransactions(){

        TransactionService transactionService = new TransactionService();

        List<Transaction> userTransactions = transactionService.findAllByAccountNumber(1);

        assertEquals(3, userTransactions.size());

    }
}
