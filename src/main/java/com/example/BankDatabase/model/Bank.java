package com.example.BankDatabase.model;

public class Bank {

    private String name;
    private long id;
    private double trust;
    private double transactionFee;

    public Bank(String name, long id, double trust, double transactionFee) {
        this.name = name;
        this.id = id;
        this.trust = trust;
        this.transactionFee = transactionFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTrust() {
        return trust;
    }

    public void setTrust(double trust) {
        this.trust = trust;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", trust=" + trust +
                ", transactionFee=" + transactionFee +
                '}';
    }
}
