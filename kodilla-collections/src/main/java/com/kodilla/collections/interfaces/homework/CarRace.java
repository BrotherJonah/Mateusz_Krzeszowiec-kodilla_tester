package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford();
        doRace(ford);

        Opel opel = new Opel();
        doRace(opel);

        Volvo volvo = new Volvo();
        doRace(volvo);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();

        System.out.println("Wartość końcowa " + car.getSpeed() + " km/h.\n");

        car.increaseSpeedBy(80);
        System.out.println(car.getSpeed());
    }
}
