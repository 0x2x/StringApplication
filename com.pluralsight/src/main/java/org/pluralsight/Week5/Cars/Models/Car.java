package org.pluralsight.Week5.Cars.Models;

public class Car extends  Vehicles{
    public Car() {
        super();
        System.out.println("Car -- class");
    }
    public Car(String color, int numberOfPassengers,int cargoCapacity,int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    private void honk() {
        System.out.println("car honks");
    }
}
