package com.ileowo.accountservice.controller;

import com.ileowo.accountservice.model.Account;
import com.ileowo.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Controller
@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{userId}")
    public List<Account> getAccountsByUserId(@PathVariable String userId) {
        return accountService.getAccountsByUserId(userId);
    }

    // other endpoints for creating, updating, and deleting accounts...
}