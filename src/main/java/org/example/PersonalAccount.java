package org.example;

public class PersonalAccount extends BankAccount {
    private String cpf;

    public PersonalAccount(String costumerName, String billingAddress, int inicialBalance, String password, String cpf) {
        super(costumerName, billingAddress, inicialBalance, password);
        this.cpf = cpf;
    }

    @Override
    public String bankAccountDetails() {
        return "Conta pessoa física:" + this.cpf;
    }
}
