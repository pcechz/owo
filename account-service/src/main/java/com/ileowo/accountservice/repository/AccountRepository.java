package com.ileowo.accountservice.repository;

import com.ileowo.accountservice.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

// Repository
public interface AccountRepository extends MongoRepository<Account, String> {
    List<Account> findByUserId(String userId);
}