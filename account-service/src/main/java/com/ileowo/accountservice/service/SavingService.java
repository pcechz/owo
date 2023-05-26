package com.ileowo.accountservice.service;

import com.ileowo.accountservice.model.Saving;
import com.ileowo.accountservice.repository.SavingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by macbook on 25/05/2023.
 * Author: Pet'r Esan
 */
@Service
public class SavingService {
    private final SavingRepository savingRepository;

    @Autowired
    public SavingService(SavingRepository savingRepository) {
        this.savingRepository = savingRepository;
    }

    public Saving createSaving(Saving saving) {
        return savingRepository.save(saving);
    }

    public List<Saving> getSavingsByAccountId(String accountId) {
        return savingRepository.findByAccountId(accountId);
    }

    public Saving updateSaving(Saving saving) {
        return savingRepository.save(saving);
    }

    public void deleteSaving(String accountId, String savingId) {
        savingRepository.deleteByIdAndAccountId(savingId, accountId);
    }
}


