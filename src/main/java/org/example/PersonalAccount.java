package org.example;

public class PersonalAccount extends BankAccount{
    private String cpf;

    public PersonalAccount(String costumerName, String billingAddress, int inicialBalance, String cpf) {
        super(costumerName, billingAddress, inicialBalance);
        this.cpf = cpf;
    }



}
