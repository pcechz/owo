package com.ileowo.accountservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Document(collection = "incomes")
public class Income {
    @Id
    private String id;
    @NotEmpty
    private String accountId;
    @NotNull
    @DecimalMin("0.0")
    private BigDecimal amount;

    @NotEmpty
    private String source;
    // getters and setters...
}
