package unittests.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedCalculatorTest {

    @Test
    public void subtract2from4_shouldEqual2() {

        Calculator calculator = new Calculator();

        calculator.add(4);

        calculator.subtract(2);

        assertEquals(2, calculator.getTotal());
    }

    @Test
    public void subtract13from1000_shouldEqual987() {

        Calculator calculator = new Calculator();

        calculator.add(1000);

        calculator.subtract(13);

        assertEquals(987, calculator.getTotal());
    }

    @Test
    public void subtract5from2_shouldEqualMinus3() {

        Calculator calculator = new Calculator();

        calculator.add(2);

        calculator.subtract(5);

        assertEquals(-3, calculator.getTotal());
    }

    @ParameterizedTest
    @CsvSource({
            "4, 2, 2",
            "1000, 13, 987",
            "2, 5, -3"
    })
    public void addThenSubtract_shouldHaveExpectedResult(
            int originalNumber, int numberToSubtract, int expectedNewTotal
    ) {
        Calculator calculator = new Calculator();

        calculator.add(originalNumber);

        calculator.subtract(numberToSubtract);

        assertEquals(expectedNewTotal, calculator.getTotal());
    }

    private Calculator myCalculator;

    @BeforeEach
    public void createNewCalculator() {

        myCalculator = new Calculator();
    }

    @Test
    public void exampleTestUsingObjectInitializedInBeforeEach() {

        myCalculator.add(5);

        assertEquals(5, myCalculator.getTotal());
    }
}
