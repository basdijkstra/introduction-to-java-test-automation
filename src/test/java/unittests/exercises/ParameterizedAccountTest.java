package unittests.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedAccountTest {

    /**
     * EXERCISE 1
     * Move the initialization of the account object for each test
     * into a JUnit5 BeforeEach method and run the tests
     * again.
     *
     * Do you think this benefits readability of the test code?
     */

    /**
     * EXERCISE 2
     * Refactor the existing tests into a parameterized test using a
     * CsvSource. What are the parameters you need to pass to the
     * test method and what are their data types?
     */
    @Test
    public void deposit100ThenAddInterest_shouldResultInBalanceOf101() throws AddInterestException {

        Account account = new Account(AccountType.SAVINGS);

        account.deposit(100);

        account.addInterest();

        assertEquals(101, account.getBalance());
    }

    @Test
    public void deposit2000ThenAddInterest_shouldResultInBalanceOf2040() throws AddInterestException {

        Account account = new Account(AccountType.SAVINGS);

        account.deposit(2000);

        account.addInterest();

        assertEquals(2040, account.getBalance());
    }

    @Test
    public void deposit6000ThenAddInterest_shouldResultInBalanceOf6180() throws AddInterestException {

        Account account = new Account(AccountType.SAVINGS);

        account.deposit(6000);

        account.addInterest();

        assertEquals(6180, account.getBalance());
    }

    /**
     * EXERCISE 3
     * After refactoring the three tests into a single data driven test,
     * do you still think using the BeforeEach hook contributes to readability?
     */
}
