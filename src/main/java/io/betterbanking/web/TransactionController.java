package io.betterbanking.web;

import io.betterbanking.entity.Transaction;
import io.betterbanking.service.TransactionService;
import io.betterbanking.web.dto.TransactionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(final TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{accountNumber}")
    List<Transaction> getTransactions(@PathVariable("accountNumber") final int accountNumber){

        List<Transaction> transactionsList = transactionService.findAllByAccountNumber(accountNumber);
        return transactionsList;
    }

    private TransactionDto map(final Transaction tr) {
        return TransactionDto.apply(tr);
    }

}
