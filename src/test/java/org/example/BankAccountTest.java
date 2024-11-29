package org.example;

import com.sun.source.tree.AssertTree;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.PrintStream;

@RunWith(MockitoJUnitRunner.class)
public class BankAccountTest extends TestCase {
    @Mock
    private PrintStream printStream;

    private PersonalAccount personalAccount;
    private BusinessAccount businessAccount;

    @Before
    public void setUp() {
        System.setOut(printStream);

        personalAccount = new PersonalAccount("Alberto", "Rua vasco da gama", 1000, "000000000-00");
        businessAccount = new BusinessAccount("Carlos", "Rua do tort", 100000, "123.123.233.0001-23");
    }

    @Test
    public void testeDepositoAccount() {
        personalAccount.deposito(500);

        Assert.assertEquals(1500, personalAccount.getBalance(), 00.1);
    }

    @Test
    public void testeDepositoBussinesAccount() {
        businessAccount.deposito(50000);

        Assert.assertEquals(150000, businessAccount.getBalance(), 00.1);
    }

    public void testeSaquePersonalAccount() {
        personalAccount.saque(500);

        Assert.assertEquals(500, personalAccount.getBalance(), 00.1);
    }


    public void testeSaqueBusinessAccount() {
        businessAccount.saque(50000);

        Assert.assertEquals(50000, businessAccount.getBalance(), 00.1);
    }

}