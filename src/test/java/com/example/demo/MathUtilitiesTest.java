package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilitiesTest {
    @Test
    void addTwoIntegersReturnsSum() {
        assertEquals(5, MathUtilities.add(2, 3));
        assertEquals(-1, MathUtilities.add(2, -3));
    }

    @Test
    void subtractTwoIntegersReturnsDifference() {
        assertEquals(-1, MathUtilities.subtract(2, 3));
        assertEquals(5, MathUtilities.subtract(2, -3));
    }

    @Test
    void multiplyTwoIntegersReturnsProduct() {
        assertEquals(6, MathUtilities.multiply(2, 3));
        assertEquals(-6, MathUtilities.multiply(2, -3));
    }

    @Test
    void divideValidInputsReturnsDoubleResult() {
        assertEquals(2.5, MathUtilities.divide(5, 2), 1e-9);
        assertEquals(-2.0, MathUtilities.divide(-4, 2), 1e-9);
    }

    @Test
    void divideByZeroThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> MathUtilities.divide(1, 0));
    }

    @Test
    void generateRandomNumberWithinBoundsForMultipleCalls()
    {
        int max = 10;
    }
}
