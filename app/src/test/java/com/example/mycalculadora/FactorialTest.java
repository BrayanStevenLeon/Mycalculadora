package com.example.mycalculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void testCalcularFactorial() {

        assertEquals(1, Factorial.calcularFactorial(0));
        assertEquals(1, Factorial.calcularFactorial(1));
        assertEquals(2, Factorial.calcularFactorial(2));
        assertEquals(6, Factorial.calcularFactorial(3));
        assertEquals(24, Factorial.calcularFactorial(4));

    }
}