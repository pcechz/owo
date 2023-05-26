package com.ileowo.accountservice.service;

import com.ileowo.accountservice.model.Expense;
import com.ileowo.accountservice.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by macbook on 25/05/2023.
 * Author: Pet'r Esan
 */
@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getExpensesByAccountId(String accountId) {
        return expenseRepository.findByAccountId(accountId);
    }

    public Expense updateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void deleteExpense(String accountId, String expenseId) {
        expenseRepository.deleteByIdAndAccountId(expenseId, accountId);
    }
}