package unittests.answers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParameterizedAccountTest {

    private Account account;

    /**
     * EXERCISE 1
     * Move the initialization of the account object for each test
     * into a JUnit5 BeforeEach method and run the tests
     * again.
     *
     * Do you think this benefits readability of the test code?
     */
    @BeforeEach
    public void createSavingsAccount() {

        account = new Account(AccountType.SAVINGS);
    }

    /**
     * EXERCISE 2
     * Refactor the existing tests into a parameterized test using a
     * CsvSource. What are the parameters you need to pass to the
     * test method and what are their data types?
     */
    @ParameterizedTest
    @CsvSource({
            "100, 101",
            "2000, 2040",
            "6000, 6180"
    })
    public void depositThenAddInterest_shouldResultInExpectedBalance(
            int originalBalance, int expectedNewBalance
    ) throws AddInterestException {

        account.deposit(originalBalance);

        account.addInterest();

        assertEquals(expectedNewBalance, account.getBalance());
    }

    /**
     * EXERCISE 3
     * After refactoring the three tests into a single data driven test,
     * do you still think using the BeforeEach hook contributes to readability?
     */
}
