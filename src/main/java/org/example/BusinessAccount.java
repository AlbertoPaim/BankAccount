package org.example;

public class BusinessAccount extends BankAccount {
    private String cnpj;

    public BusinessAccount(String costumerName, String billingAddress, int inicialBalance, String password, String cnpj) {
        super(costumerName, billingAddress, inicialBalance, password);
        this.cnpj = cnpj;
    }

    @Override
    public String bankAccountDetails() {
        return "Conta PJ:" + this.cnpj;
    }
}
