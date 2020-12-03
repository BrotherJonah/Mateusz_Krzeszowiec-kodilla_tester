package com.kodilla.collections.array.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car name: " + getCarName(car)); //pobieram nazwę auta abstrakcyjnego obiektu car
        System.out.println("Car speed: " + car.getSpeed());
//        System.out.println("Increase car speed: " + car.increaseSpeedBy(20)); //dlaczego nie mogę tego wyświetlić?
//        System.out.println("Decrease car speed: " + car.decreaseSpeed());
//        System.out.println("Actual car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Volvo)
            return "Volvo";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown Car name";
    }
}