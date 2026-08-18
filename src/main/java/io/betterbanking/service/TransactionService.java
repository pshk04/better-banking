package io.betterbanking.service;

import io.betterbanking.entity.Transaction;
import io.betterbanking.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(final TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findAllByAccountNumber(int accountNumber){

        return transactionRepository.findAllByAccountNumber(accountNumber);
    }
}
