package com.ileowo.accountservice.service;

import com.ileowo.accountservice.model.AccountSetting;
import com.ileowo.accountservice.repository.AccountSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by macbook on 25/05/2023.
 * Author: Pet'r Esan
 */
@Service
public class AccountSettingService {
    private final AccountSettingRepository accountSettingRepository;

    @Autowired
    public AccountSettingService(AccountSettingRepository accountSettingRepository) {
        this.accountSettingRepository = accountSettingRepository;
    }

    public AccountSetting createAccountSetting(AccountSetting accountSetting) {
        return accountSettingRepository.save(accountSetting);
    }

    public List<AccountSetting> getAccountSettingsByAccountId(String accountId) {
        return accountSettingRepository.findByAccountId(accountId);
    }

    public AccountSetting updateAccountSetting(AccountSetting accountSetting) {
        return accountSettingRepository.save(accountSetting);
    }

    public void deleteAccountSetting(String accountId, String settingId) {
        accountSettingRepository.deleteByIdAndAccountId(settingId, accountId);
    }
}


