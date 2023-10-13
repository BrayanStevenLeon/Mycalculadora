package com.example.mycalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(8, 3);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 7);
        assertEquals(28, result);
    }
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }
    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 0);
        assertEquals(0, result);
    }
}