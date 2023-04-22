import jdk.nashorn.internal.runtime.regexp.joni.ast.BackRefNode;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass() throws Exception{
        System.out.println("This executes before any test cases. Count = "+ count++);
    }

    @org.junit.Before
    public void setup() throws Exception{
        account = new BankAccount("Hrishi", "Shedge", 2000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }
    @org.junit.Test
    public void deposit() throws Exception{
        double balance = account.deposit(200.00, true);
        assertEquals(2200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception{
        double balance = account.withdraw(600.00, true);
        assertEquals(1400.00, balance, 0);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        account.withdraw(600.00, false);
        fail("Should have thrown an illegalArgumentException");
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception{
        account.deposit(200.00, true);
        assertEquals(2200.00, account.getBalance(), 0);
    }
    @org.junit.Test
    public void getBalance_withdraw() throws Exception{
        account.withdraw(200.00, true);
        assertEquals(1800.00, account.getBalance(), 0);
    }

//    @org.junit.Test
//    public void dummyTest() {
//        assertEquals(20, 21);
//    }

    @org.junit.Test
    public void isChecking_true() throws Exception{
        assertTrue("Account is not a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() throws Exception{
        System.out.println("This executes after any test cases. Count = "+ count++);
    }

    @org.junit.After
    public void teardown() throws Exception{
        System.out.println("Count = "+ count++);
    }
}