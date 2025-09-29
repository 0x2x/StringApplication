package org.pluralsight.weektwo.CalculatorWithMethods;

import java.util.Scanner;

public class RentalCarCalculator {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String PickUpDate;
        int NumberOfRentalDays;
        boolean EletronicTollTag = false; // $3.95 a day
        boolean GPS = false; // $2.95 a aday
        boolean WantRoadSideAssistance = false; // $3.95 a day
        int Age;

        double totalPrice = 0;

        System.out.println("Pickup Date");
        PickUpDate = scan.nextLine();

        System.out.println("How many days");
        NumberOfRentalDays = scan.nextInt();
        scan.nextLine();

        System.out.println("Want a Electronic toll tag toll tag? ($3.95) a day [yes/no]: ");
        String wantsEletronicTollTag = scan.nextLine();
        if(wantsEletronicTollTag.equalsIgnoreCase("yes")) {
            EletronicTollTag = true;
        }

        System.out.println("Want a GPS ($2.95) [yes/no]: ");
        String wantsAGps = scan.nextLine();
        if(wantsAGps.equalsIgnoreCase("yes")) {
            GPS = true;
        }

        System.out.println("Want roadside assistance $3.95 [yes/no]: ");
        String roadsideAssistance = scan.nextLine();
        if (roadsideAssistance.equalsIgnoreCase("yes")) {
            WantRoadSideAssistance = true;
        }

        System.out.println("How old are you? ");
        Age = scan.nextInt();

        totalPrice += 29.99; // per day

        if (Age <= 25) {
            // 30% surcharge on car renters under 25;
            totalPrice += (30 / 100) * totalPrice;
        }
        totalPrice *= NumberOfRentalDays;
        
        if (GPS == true) {
            totalPrice += (2.95 * NumberOfRentalDays);
        }
        
        if (EletronicTollTag == true) {
            totalPrice += (3.95 * NumberOfRentalDays);
        }
        
        if (WantRoadSideAssistance == true) {
            totalPrice += (3.95 * NumberOfRentalDays);
        }

        String TotalComesOutToStr = "Total comes out to listed at bottom";
        if(Age < 25) {
            TotalComesOutToStr += "\n30% surcharge fee for driver under 25";
        }
        if (GPS == true) {
            TotalComesOutToStr += "\n+ Gps FEE";
        }

        if (EletronicTollTag == true) {
            TotalComesOutToStr += "\n+ Eletronic toll tag FEE";

        }

        if (WantRoadSideAssistance == true) {
            TotalComesOutToStr += "\n+ Road side assistance FEE";

        }
        TotalComesOutToStr += "\n" + "Total PRICE: " + totalPrice;
        System.out.println(TotalComesOutToStr);
    }
}
