package com.ileowo.accountservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

// Model
@Document(collection = "accounts")
public class Account {
    @Id
    private String id;
    @NotEmpty
    private String userId;

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal balance;
    // getters and setters...
}