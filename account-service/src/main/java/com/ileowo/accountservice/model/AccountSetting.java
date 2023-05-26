package com.ileowo.accountservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by macbook on 25/05/2023.
 * Author: Pet'r Esan
 */
@Document(collection = "accountSettings")
public class AccountSetting {
    @Id
    private String id;
    private String accountId;
    private String settingName;
    private String settingValue;
    // getters and setters...
}