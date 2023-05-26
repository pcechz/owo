package com.ileowo.accountservice.repository;

import com.ileowo.accountservice.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by macbook on 25/05/2023.
 * Author: Pet'r Esan
 */
@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
    List<Expense> findByAccountId(String accountId);
    void deleteByIdAndAccountId(String id, String accountId);
}