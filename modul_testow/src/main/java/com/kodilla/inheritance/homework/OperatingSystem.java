package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int systemPublishYear;

    public OperatingSystem(int systemPublishYear){ //czy konstruktor może mieć zdefiniowany typ (int)?
        this.systemPublishYear = systemPublishYear;
    }

    public void turnOn(){
        System.out.println("System został włączony");
    }

    public void turnOff(){
        System.out.println("System został wyłączony\n");
    }

    public void bugsCheck() {
        System.out.println("Ten system jest wolny od bugów");
    }
}