package com.example.BankDatabase.datasource.implementation;

import com.example.BankDatabase.datasource.BankDataSource;
import com.example.BankDatabase.model.Bank;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MockDataSource implements BankDataSource {

    List<Bank> banks;

    public MockDataSource() {
        banks = new ArrayList<>();
        banks.add(new Bank("kanishk paisa limited", 123456, 100.0, 0.0));
        banks.add(new Bank("kunal dena bank", 456789, 80.0, 2.0));
        banks.add(new Bank("karan see i see i", 789456, 69.0, 5.0));
    }

    @Override
    //We can't override private, static(due to static binding) and final method
    public List<Bank> retrieveBanks() {

        return this.banks;
    }

    @Override
    public Bank retrieveBank(long id) {
        for (Bank bank : banks) {
            if (bank.getId() == id) {
                return bank;
            }
        }

        return null;
    }

    @Override
    public String addBank(Bank bank) {
        //bank is not null

        if(bank != null) {
            banks.add(bank);
            return "your bank " + bank + " is added to the database";
        }

        return "invalid bank data, check again.";
    }
}
