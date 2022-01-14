package unittests.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

        // TODO: add the requested assertion
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

        // TODO: complete the body of the test method
    }

    /**
     * Write a test method that performs the following steps:
     * 1. Create a new Account object of type AccountType.SAVINGS
     * 2. Deposit 2000 dollars into the account using the deposit() method
     * 3. Calculate and add interest for the account using the addInterest() method
     * 4. Assert that the resulting balance is equal to 2040 dollars
     */

    // TODO: write the requested test method

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

        // TODO: complete the body of the test method
    }
}
