package com.ileowo.accountservice.controller;

import com.ileowo.accountservice.model.*;
import com.ileowo.accountservice.service.AccountService;
import com.ileowo.accountservice.service.ExpenseService;
import com.ileowo.accountservice.service.IncomeService;
import com.ileowo.accountservice.service.SavingService;
import com.ileowo.accountservice.service.AccountSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

// Controller
@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;
    private final IncomeService incomeService;
    private final ExpenseService expenseService;
    private final SavingService savingService;
    private final AccountSettingService accountSettingService;

    @Autowired
    public AccountController(AccountService accountService, IncomeService incomeService, ExpenseService expenseService, SavingService savingService, AccountSettingService accountSettingService) {
        this.accountService = accountService;
        this.incomeService = incomeService;
        this.expenseService = expenseService;
        this.savingService = savingService;
        this.accountSettingService = accountSettingService;
    }

    // Existing Account endpoints...

    // Income endpoints
    @PostMapping("/{accountId}/incomes")
    public Income createIncome(@PathVariable String accountId, @Valid @RequestBody Income income) {
        // Add validation to ensure accountId matches income.getAccountId()
        return incomeService.createIncome(income);
    }

    // Income endpoints
    @GetMapping("/{accountId}/incomes")
    public List<Income> getIncomes(@PathVariable String accountId) {
        return incomeService.getIncomesByAccountId(accountId);
    }

    @PutMapping("/{accountId}/incomes/{incomeId}")
    public Income updateIncome(@PathVariable String accountId, @PathVariable String incomeId, @Valid @RequestBody Income income) {
        // Add validation to ensure accountId and incomeId match those in the income object
        return incomeService.updateIncome(income);
    }

    @DeleteMapping("/{accountId}/incomes/{incomeId}")
    public void deleteIncome(@PathVariable String accountId, @PathVariable String incomeId) {
        incomeService.deleteIncome(accountId, incomeId);
    }

    // Expense endpoints
    @PostMapping("/{accountId}/expenses")
    public Expense createExpense(@PathVariable String accountId, @Valid @RequestBody Expense expense) {
        // Add validation to ensure accountId matches expense.getAccountId()
        return expenseService.createExpense(expense);
    }

    @GetMapping("/{accountId}/expenses")
    public List<Expense> getExpenses(@PathVariable String accountId) {
        return expenseService.getExpensesByAccountId(accountId);
    }

    @PutMapping("/{accountId}/expenses/{expenseId}")
    public Expense updateExpense(@PathVariable String accountId, @PathVariable String expenseId, @Valid @RequestBody Expense expense) {
        // Add validation to ensure accountId and expenseId match those in the expense object
        return expenseService.updateExpense(expense);
    }

    @DeleteMapping("/{accountId}/expenses/{expenseId}")
    public void deleteExpense(@PathVariable String accountId, @PathVariable String expenseId) {
        expenseService.deleteExpense(accountId, expenseId);
    }

    // Saving endpoints
    @PostMapping("/{accountId}/savings")
    public Saving createSaving(@PathVariable String accountId, @Valid @RequestBody Saving saving) {
        // Add validation to ensure accountId matches saving.getAccountId()
        return savingService.createSaving(saving);
    }

    @GetMapping("/{accountId}/savings")
    public List<Saving> getSavings(@PathVariable String accountId) {
        return savingService.getSavingsByAccountId(accountId);
    }

    @PutMapping("/{accountId}/savings/{savingId}")
    public Saving updateSaving(@PathVariable String accountId, @PathVariable String savingId, @Valid @RequestBody Saving saving) {
        // Add validation to ensure accountId and savingId match those in the saving object
        return savingService.updateSaving(saving);
    }

    @DeleteMapping("/{accountId}/savings/{savingId}")
    public void deleteSaving(@PathVariable String accountId, @PathVariable String savingId) {
        savingService.deleteSaving(accountId, savingId);
    }


    // AccountSetting endpoints
    @PostMapping("/{accountId}/settings")
    public AccountSetting createAccountSetting(@PathVariable String accountId, @Valid @RequestBody AccountSetting accountSetting) {
        // Add validation to ensure accountId matches accountSetting.getAccountId()
        return accountSettingService.createAccountSetting(accountSetting);
    }

    @GetMapping("/{accountId}/settings")
    public List<AccountSetting> getAccountSettings(@PathVariable String accountId) {
        return accountSettingService.getAccountSettingsByAccountId(accountId);
    }

    @PutMapping("/{accountId}/settings/{settingId}")
    public AccountSetting updateAccountSetting(@PathVariable String accountId, @PathVariable String settingId, @Valid @RequestBody AccountSetting accountSetting) {
        // Add validation to ensure accountId and settingId match those in the accountSetting object
        return accountSettingService.updateAccountSetting(accountSetting);
    }

    @DeleteMapping("/{accountId}/settings/{settingId}")
    public void deleteAccountSetting(@PathVariable String accountId, @PathVariable String settingId) {
        accountSettingService.deleteAccountSetting(accountId, settingId);
    }
}
