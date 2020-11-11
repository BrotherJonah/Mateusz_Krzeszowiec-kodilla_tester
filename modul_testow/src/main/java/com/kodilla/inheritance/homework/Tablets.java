package com.kodilla.inheritance.homework;

public class Tablets extends OperatingSystem {
    public Tablets(int systemPublishYear){
        super(systemPublishYear);
    }

    @Override
    public void bugsCheck() {
        System.out.println("Ten Tablet jest wolny od bugów.");
    }
}
