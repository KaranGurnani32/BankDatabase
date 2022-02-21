package com.example.BankDatabase.datasource;

import com.example.BankDatabase.model.Bank;

import java.util.List;

public interface BankDataSource {

    public List<Bank> retrieveBanks();
    public Bank retrieveBank(long id);
    public String addBank(Bank bank);
}
