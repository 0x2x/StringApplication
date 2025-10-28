package org.pluralsight.Week5.Cars;

import org.pluralsight.Week5.Cars.Models.HoverCraft;
import org.pluralsight.Week5.Cars.Models.Moped;
import org.pluralsight.Week5.Cars.Models.SemiTruck;

public class main {
    static void main() {
        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("blue");
        semiTruck.setFuelCapacity(100);

        HoverCraft plane = new HoverCraft();
        plane.setColor("white");
        plane.setFuelCapacity(100);
        plane.setCargoCapacity(10);

        Moped slowRide = new Moped();
        slowRide.setColor("orange");
        slowRide.setFuelCapacity(100);

        System.out.println(slowRide.getColor());
        System.out.println(plane.getColor());
        System.out.println(semiTruck.getColor());

    }
}
