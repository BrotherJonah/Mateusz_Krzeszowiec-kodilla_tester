package com.kodilla.collections.array.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        int drawnCarsTableLength = random.nextInt(15);
        Car[] cars = new Car[drawnCarsTableLength];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar(); //losuje i wkładam do tablicy randomowy samochód
        for (Car car : cars) //na każdym obiekcie z tablicy cars[] wywołuje metodę describeCar(abstrakcyjnego obiektu car)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();

        int drawnCarKind = random.nextInt(3);
        int drawnValueOfIncreaseSpeed = random.nextInt(100) ;
        if (drawnCarKind == 0)
            return new Volvo(); //+ Volvo.increaseSpeedBy(drawnValueOfIncreaseSpeed);
        else if (drawnCarKind == 1)
            return new Opel();
        else
            return new Ford();
    }
}
