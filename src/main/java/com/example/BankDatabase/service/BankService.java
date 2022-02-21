package com.example.BankDatabase.service;

import com.example.BankDatabase.model.Bank;

import java.util.List;

public interface BankService {

    public List<Bank> getBanks();
    public Bank getBank(long id);
    public String addBank(Bank bank);
}
