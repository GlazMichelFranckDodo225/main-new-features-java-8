package com.dgmf.d.interfaces.defaultstaticmethods;

import com.dgmf.d.interfaces.defaultstaticmethods.impl.Car;

public class DefaultStaticMethodDriver {
    public static void main(String[] args) {
        // Car car = new Car(); ==> Owned Default Methods
        Vehicle car = new Car();
        // Redefined Methods
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        // Default Methods
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        // Static Method
        System.out.println(Vehicle.getCompany());
    }
}
