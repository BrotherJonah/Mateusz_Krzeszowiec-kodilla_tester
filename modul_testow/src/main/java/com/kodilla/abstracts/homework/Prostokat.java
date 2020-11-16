package com.kodilla.abstracts.homework;

public class Elipsa extends Shape {

    double PI = 3.1415927;
    double a;
    double b;
    double wynikPole;
    double wynikObwod;

    @Override
    public double PolePowierzchni() {

        wynikPole = PI * a * b;

        return wynikPole;
    }

    @Override
    public double Obwod() {

        

        return wynikObwod;
    }
}
