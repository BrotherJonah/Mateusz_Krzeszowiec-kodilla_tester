package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car {
    int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        for(int i = 0; i < 3; i++){
            if (this.speed == 0){
                System.out.println("Prędkość początkowa auta marki Volvo wynosi 0");
            }
            this.speed += 70;
            System.out.println("Prędkość wzrasta do " + speed + " km/h");
        }
    }

    @Override
    public void decreaseSpeed() {
        for(int i = 0; i < 2; i++){
            this.speed -= 10;
            System.out.println("Prędkość auta maleje: " + speed + " km/h");
        }
    }
}
