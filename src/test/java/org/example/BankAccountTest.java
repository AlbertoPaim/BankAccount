package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest extends TestCase {
    private PersonalAccount personalAccount;

    @Before
    public void setUp() {
        personalAccount = new PersonalAccount("Alberto", "Rua vasco da gama", 1000, "000000000-00");

    }

    @Test
    public void testeDepositoAccount() {
        personalAccount.deposito(500);

        Assert.assertEquals(1500, personalAccount.getBalance(), 00.1);
    }

}