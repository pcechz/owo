package com.ileowo.accountservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by macbook on 25/05/2023.
 * Author: Pet'r Esan
 */
@Document(collection = "expenses")
public class Expense {
    @Id
    private String id;
    @NotEmpty
    private String accountId;
    @NotNull
    @DecimalMin("0.0")
    private BigDecimal amount;
    @NotEmpty
    private String category;
    // getters and setters...
}