package core.basesyntax;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calc;
    private double value1;
    private double value2;
    private double actual;
    //private static final double MIN_DOUBLE = Double.MIN_VALUE;
    //private static final double MAX_DOUBLE = Double.MAX_VALUE;

    @BeforeAll
    static void beforeAll() {
        calc = new Calculator();
    }

    @Test
    void addPositiveOperands() {
        value1 = 5.0;
        value2 = 12.0;
        actual = calc.calculate(value1, value2, '+');
        assertEquals(actual, 17.0);
    }

    @Test
    void addNegativeOperands() {
        value1 = -5.0;
        value2 = -12.0;
        actual = calc.calculate(value1, value2, '+');
        assertEquals(actual, -17.0);
    }

    @Test
    void addPositiveAndNegativeOperands() {
        value1 = 5.0;
        value2 = -12.0;
        actual = calc.calculate(value1, value2, '+');
        assertEquals(actual, -7.0);
    }

    @Test
    void addZeroInDifferentPlaces() {
        value1 = 5.0;
        actual = calc.calculate(value1, 0, '+');
        assertEquals(actual, 5.0);
        actual = calc.calculate(0, value1, '+');
        assertEquals(actual, 5.0);
    }

    @Test
    void addMaxAndMinDoubleValues() {
        double result = 1.7976931348623157E308;
        actual = calc.calculate(Double.MIN_VALUE, Double.MAX_VALUE, '+');
        assertEquals(actual, result);
    }

    @Test
    void subPositiveOperands() {
        value1 = 5.0;
        value2 = 12.0;
        actual = calc.calculate(value1, value2, '-');
        assertEquals(actual, -7.0);
    }
}