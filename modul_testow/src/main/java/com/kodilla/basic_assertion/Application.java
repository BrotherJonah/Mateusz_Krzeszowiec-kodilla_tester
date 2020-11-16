package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        int substractResult = calculator.subtract(a, b);
        int toSquareResultA = calculator.toSquare(a);
        int toSquareResultB = calculator.toSquare(b);

        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSub = ResultChecker.assertEquals(-3, substractResult);
        if (correctSub){
            System.out.println(" Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println(" Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctToSquareA = ResultChecker.assertEquals(25, toSquareResultA);
        if (correctToSquareA){
            System.out.println(" Metoda toSquare działa poprawnie dla liczby " + a);
        } else {
            System.out.println(" Metoda toSquare nie działa poprawnie dla liczby " + a);
        }

        boolean correctToSquareB = ResultChecker.assertEquals(64, toSquareResultB);
        if (correctToSquareB){
            System.out.println(" Metoda toSquare działa poprawnie dla liczby " + b);
        } else {
            System.out.println(" Metoda toSquare nie działa poprawnie dla liczby " + b);
        }
    }
}

