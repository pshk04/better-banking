package io.betterbanking.repository;

import io.betterbanking.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    List<Transaction> findAllByAccountNumber(final Integer accountNumber);

    @Query("select distinct t.accountNumber from Transaction t")
    List<Integer> findAllAccountNumbers();
}
