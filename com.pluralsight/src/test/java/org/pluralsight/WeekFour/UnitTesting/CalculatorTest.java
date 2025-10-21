package org.pluralsight.WeekFour.UnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.pluralsight.WeekFour.UnitTesting.Calculator.*;

class CalculatorTest {
    @Test
    public void happyPath() {
        double addResult = Add(41, 42);
        double divideResult = Divide(41, 42);
        double subtractResult = Subtract(41, 42);
        double multiplyResult = Multiply(41, 42);

        assertEquals(83, addResult); // knows addResult() is going to be 83;
        assertEquals(0.9761904761904762, divideResult); // knows addResult() is going to be 83;
        assertEquals(-1, subtractResult); // knows addResult() is going to be 83;
        assertEquals(1722, multiplyResult); // knows addResult() is going to be 83;


    }

}