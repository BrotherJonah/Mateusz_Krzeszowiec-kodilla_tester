package com.kodilla.inheritance.homework;

public class Computers extends OperatingSystem {
    public Computers(int systemPublishYear){
        super(systemPublishYear);
    }

    @Override
    public void bugsCheck() {
        System.out.println("Ten komputer jest wolny od bugów.");
    }
}
