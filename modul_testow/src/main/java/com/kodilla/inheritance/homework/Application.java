package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args){
        OperatingSystem system1 = new OperatingSystem(2001);
        System.out.println("System nr 1");
        system1.turnOn();
        system1.bugsCheck();
        system1.turnOff();

        Computers computer1 = new Computers(2012);
        System.out.println("Komputer nr 1");
        computer1.turnOn();
        computer1.bugsCheck();
        computer1.turnOff();

        Tablets tablet1 = new Tablets(2003);
        System.out.println("Tablet nr 1");
        tablet1.turnOn();
        tablet1.bugsCheck();
        tablet1.turnOff();
    }
}
