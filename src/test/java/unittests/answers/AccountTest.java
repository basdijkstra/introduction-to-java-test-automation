package unittests.answers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    /**
     * Complete the test by adding an assertion that checks that the resulting
     * balance after the deposit() operation is equal to 100. Use the getBalance()
     * method in the Account class to retrieve the actual balance.
     */
    @Test
    public void deposit100_checkBalance_shouldBe100() {

        Account account = new Account(AccountType.CHECKING);

        account.deposit(100);

        assertEquals(100, account.getBalance());
    }

    /**
     * Perform the following steps in the body of the test method:
     * 1. Create a new Account object of type AccountType.CHECKING
     * 2. Deposit 30 dollars into the account using the deposit() method
     * 3. Withdraw 40 dollars from the account using the withdraw() method
     * 4. Assert that the resulting balance is equal to -10 dollars
     */
    @Test
    public void overdrawFromCheckingAccount_shouldBePossible() throws WithdrawException {

        Account account = new Account(AccountType.CHECKING);

        account.deposit(30);

        account.withdraw(40);

        assertEquals(-10, account.getBalance());
    }

    /**
     * Write a test method that performs the following steps:
     * 1. Create a new Account object of type AccountType.SAVINGS
     * 2. Deposit 2000 dollars into the account using the deposit() method
     * 3. Calculate and add interest for the account using the addInterest() method
     * 4. Assert that the resulting balance is equal to 2040 dollars
     */
    @Test
    public void withdrawFromSavingsAccount_shouldResultInUpdatedBalance() throws WithdrawException {

        Account account = new Account(AccountType.SAVINGS);

        account.deposit(30);

        account.withdraw(20);

        assertEquals(10, account.getBalance());
    }

    /**
     * BONUS EXERCISE (this might require some Google work)
     * Perform the following steps in the body of the test method:
     * 1. Create a new Account object of type AccountType.SAVINGS
     * 2. Deposit 30 dollars into the account using the deposit() method
     * 3. Assert that trying to withdraw 40 dollars from the account using
     *    the withdraw() method throws a WithdrawException
     */
    @Test
    public void overdrawFromSavingsAccount_shouldThrowWithdrawException() {

        Account account = new Account(AccountType.SAVINGS);

        account.deposit(30);

        assertThrows(WithdrawException.class, () -> account.withdraw(40));
    }
}
