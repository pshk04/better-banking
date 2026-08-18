package io.betterbanking.service;

import io.betterbanking.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(int accountNumber){
        List<Transaction> transactionList = new ArrayList<>();
        Transaction transaction;

        for(int i = 0; i < 3; i++){
            transaction = new Transaction();

            transactionList.add(transaction);
        }
        return transactionList;
    }
}
