package com.ileowo.accountservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * Created by macbook on 25/05/2023.
 * Author: Pet'r Esan
 */
@Document(collection = "savings")
public class Saving {
    @Id
    private String id;
    private String accountId;
    private BigDecimal amount;
    private String goal;
    // getters and setters...
}