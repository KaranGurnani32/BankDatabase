package com.example.BankDatabase.service.implementation;

import com.example.BankDatabase.datasource.BankDataSource;
import com.example.BankDatabase.model.Bank;
import com.example.BankDatabase.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MockBankService implements BankService {
    private final BankDataSource datasource;

    public MockBankService(BankDataSource datasource) {
        this.datasource = datasource;
    }

    @Override
    public List<Bank> getBanks() {
        return datasource.retrieveBanks();
    }

    @Override
    public Bank getBank(long id) {
        return datasource.retrieveBank(id);
    }

    @Override
    public String addBank(Bank bank) {
        return datasource.addBank(bank);
    }
}
