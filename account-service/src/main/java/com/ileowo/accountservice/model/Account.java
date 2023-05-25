package com.ileowo.accountservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

// Model
@Document(collection = "accounts")
public class Account {
    @Id
    private String id;
    private String userId;
    private BigDecimal balance;
    // getters and setters...
}