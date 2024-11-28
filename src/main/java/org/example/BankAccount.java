package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    private String costumerName;
    private String billingAddress;
    private int balance;
    private List<String> transactions;

    public BankAccount(String costumerName, String billingAddress, int inicialBalance) {
        this.costumerName = costumerName;
        this.billingAddress = billingAddress;
        this.balance = inicialBalance;
        this.transactions = new ArrayList<>();
        this.transactions.add("Saldo inicial:" + inicialBalance);
    }

    public void deposito(int amount) {
        if (amount > 0) {
            this.balance += amount;
            this.transactions.add("Novo deposito de R$: " + amount);
        }

    }

    public void saque(int amount) {
        if (balance > amount) {
            this.balance -= amount;
            this.transactions.add("Novo saque de R$: " + amount);
        }
    }

    public String getCostumerName() {
        return costumerName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public int getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }
}
