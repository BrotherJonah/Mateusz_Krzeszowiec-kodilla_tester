package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testToSquareNegativeNumber() {
        Calculator calculator = new Calculator();
        int a = -3;

        int toSquareResultA = calculator.toSquare(a);
        assertEquals(9, toSquareResultA);
    }

    @Test
    public void testToSquarePossitiveNumber() {
        Calculator calculator = new Calculator();
        int b = 2;

        int toSquareResultB = calculator.toSquare(b);
        assertEquals(4, toSquareResultB);
    }

    @Test
    public void testToSquareWithNumberZero() {
        Calculator calculator = new Calculator();
        int c = 0;

        int toSquareResultC = calculator.toSquare(c);
        assertEquals(0, toSquareResultC);
    }
}
