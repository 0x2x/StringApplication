package org.pluralsight.Week5.AssetManager;

import org.pluralsight.Week5.AssetManager.Models.Asset;
import org.pluralsight.Week5.AssetManager.Models.House;
import org.pluralsight.Week5.AssetManager.Models.Vehicle;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Asset> assets = new ArrayList<>();

        House myHouse = new House();
        myHouse.setAddress("187th murda block");
        myHouse.setCondition(1);
        myHouse.setLotSize(575);
        myHouse.setSquareFoot(1500);
        myHouse.setOriginalCost(400_000);
        myHouse.setDateAquired("04/25/2025");
        myHouse.setDescription("Family house");

        Vehicle myCar = new Vehicle();
        myCar.setOdometer(25000);
        myCar.setYear(2008);
        myCar.setMakeModel("Subaru Impreza");
        myCar.setOriginalCost(800);
        myCar.setDateAquired("04/24/2024");
        myCar.setDescription("my car");


        Vehicle randomCar = new Vehicle("Lexus Ls400", 2000, 25000);
        randomCar.setOriginalCost(9999);
        randomCar.setDateAquired("05/05/2025");
        randomCar.setOdometer(250050);
        assets.add(myHouse);
        assets.add(myCar);
        assets.add(randomCar);

        for(Asset house : assets) {
            System.out.println("======");
            if(house instanceof House) { // check if a house
                System.out.println("Type: house");
                System.out.println("[1 the better ; 4 the worst] Condition: " + ((House) house).getCondition() );
                System.out.println("Original Cost: " + house.getOriginalCost());
                System.out.println("Date Acquired: " + house.getDateAquired());
                System.out.println("Description" + ((House) house).getAddress());
                System.out.println("Get Value: " + ((House) house).getValue());

            } else if(house instanceof Vehicle) {
                System.out.println("Type: Vehicle");
                System.out.println("[The lower the better] Miles: " + ((Vehicle) house).getOdometer() );
                System.out.println("Original Cost: " + house.getOriginalCost());
                System.out.println("Date Acquired: " + house.getDateAquired());
                System.out.println("Make & Model" + ((Vehicle) house).getMakeModel());
                System.out.println("Year: " + ((Vehicle) house).getYear());
                System.out.println("Get Value: " + house.getValue());


            }

        }
    }
}
