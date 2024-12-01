package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class BankAccount {
    private String costumerName;
    private String billingAddress;
    private int balance;
    private List<String> transactions;
    private String password;

    public BankAccount(String costumerName, String billingAddress, int inicialBalance, String password) {
        this.costumerName = costumerName;
        this.billingAddress = billingAddress;
        this.balance = inicialBalance;
        this.transactions = new ArrayList<>();
        this.transactions.add("Saldo inicial:" + inicialBalance);
        this.password = password;
    }

    public void deposito(int amount) {
        if (amount > 0) {
            this.balance += amount;
            this.transactions.add("Novo deposito de R$: " + amount);
        }

    }

    public void saque(int amount) {
        if (balance > amount && amount > 0) {
            this.balance -= amount;
            this.transactions.add("Novo saque de R$: " + amount);
        }
    }

    public abstract String bankAccountDetails();

    public void extrato() {
        System.out.println("Extrato bancário de " + costumerName);
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println("Saldo:" + balance);
    }

    public boolean verifyPassword(String typedPassword){
        return typedPassword.equals(this.password);
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
