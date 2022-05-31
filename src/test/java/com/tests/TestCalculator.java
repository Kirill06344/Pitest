package com.tests;

import com.classes.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    private static final double DELTA = 1e-15;

    @Test
    public void testSum() {
        Calculator c = new Calculator();
        assertEquals(2D, c.sum(1D, 1D), DELTA);
    }

    @Test
    public void testDiff() {
        Calculator c = new Calculator();
        assertEquals(0D, c.diff(1D, 1D), DELTA);
    }

    @Test
    public void testMul() {
        Calculator c = new Calculator();
        assertEquals(1D, c.mul(1D, 1D), DELTA);
    }

    @Test
    public void testDivide() {
        Calculator c = new Calculator();
        assertEquals(1D, c.divide(1D, 1D), DELTA);
    }
}
