package unittests.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void add2and0_shouldEqual2() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        calculator.add(2);

        // Assert
        assertEquals(2, calculator.getTotal());
    }

    @Test
    public void subtract2from0_shouldEqualMinus3() {

        Calculator calculator = new Calculator();

        calculator.subtract(2);

        assertEquals(-3, calculator.getTotal());
    }
}
