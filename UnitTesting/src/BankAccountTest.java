import jdk.nashorn.internal.runtime.regexp.joni.ast.BackRefNode;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Hrishi", "Shedge", 2000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(2200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("dharmesh", "shedge", 4000.00, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(4200.00, account.getBalance(), 0);
    }
    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("dharmesh", "shedge", 4000.00, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(3800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void dummyTest() {
        assertEquals(20, 21);
    }

    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Hrishi", "Shedge", 1000.00, BankAccount.CHECKING);
        assertTrue("Account is not a checking account", account.isChecking());
    }
}