package io.betterbanking.controller;

import io.betterbanking.entity.Transaction;
import io.betterbanking.service.TransactionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(final TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{accountNumber}")
    List<Transaction> getTransactions(@PathVariable("accountNumber") final int accountNumber){

        List<Transaction> transactionsList = transactionService.findAllByAccountNumber(accountNumber);
        return transactionsList;
    }
}
