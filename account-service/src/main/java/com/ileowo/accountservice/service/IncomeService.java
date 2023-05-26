package com.ileowo.accountservice.service;

import com.ileowo.accountservice.model.Income;
import com.ileowo.accountservice.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by macbook on 25/05/2023.
 * Author: Pet'r Esan
 */
@Service
public class IncomeService {
    private final IncomeRepository incomeRepository;

    @Autowired
    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public Income createIncome(Income income) {
        // Add business logic for creating an income here...
        return incomeRepository.save(income);
    }

    public List<Income> getIncomesByAccountId(String accountId) {
        // Add business logic for getting incomes by account ID here...
        return incomeRepository.findByAccountId(accountId);
    }

    public Income updateIncome(Income income) {
        // Add business logic for updating an income here...
        return incomeRepository.save(income);
    }

    public void deleteIncome(String accountId, String incomeId) {
        // Add business logic for deleting an income here...
        incomeRepository.deleteByIdAndAccountId(incomeId, accountId);
    }
}

