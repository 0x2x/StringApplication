package org.pluralsight.weekone.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichShop {

    static void FirstExcerise() {
        Scanner scan = new Scanner(System.in);

        double SandWich_Large = 8.95;
        double SandWich_Regular = 5.45;
        int Age;
        int Choice;
        double discount = 0;
        double price;

        String prettySpecialMenu = """
                (1) Sandwich Large - $8.95
                (2) Sandwich Regular - $5.45
                If you're a student you get 10% off.
                If you're a senior you get 20% off.
                """;
        System.out.println(prettySpecialMenu); // print menu out
        Choice = scan.nextInt(); // look for option that must be a integer

        if (Choice >= 3 || Choice <= 0) { // if they choose something over
            System.out.println("That is not on the menu.");
        } else {
            System.out.println("How old are you");
            Age = scan.nextInt();
            if (Choice == 1) {
                price = SandWich_Large;
            } else {
                price = SandWich_Regular;
            }

            if (Age <= 17) {
                discount = 0.10;
            } else if (Age >= 65) {
                discount = 0.20;
            }
            if (discount > 0) {
                price = price - discount;
                System.out.printf("You get a %%%f off\n", discount * 100);
            }
            System.out.printf("The price of the sandwich will be: %f", price);
        }

    }
    static void SecondExercise() {
        Scanner scan = new Scanner(System.in);

        double SandWich_Large = 8.95;
        double SandWich_Regular = 5.45;
        int Age;
        int Choice;
        double discount = 0;
        double price;

        List<String> NoOption = new ArrayList<>();
        NoOption.add("nope");
        NoOption.add("n");
        NoOption.add("0");
        NoOption.add("no");

        List<String> YesOption = new ArrayList<>();
        YesOption.add("yes");
        YesOption.add("y");
        YesOption.add("1");
        YesOption.add("ye");


        String prettySpecialMenu = """
                (1) Sandwich Large - $8.95
                (2) Sandwich Regular - $5.45
                If you're a student you get 10% off.
                If you're a senior you get 20% off.
                """;
        System.out.println(prettySpecialMenu); // print menu out
        System.out.print("What do you want: ");
        Choice = scan.nextInt(); // look for option that must be a integer



        if (Choice >= 3 || Choice <= 0) { // if they choose something over
            System.out.println("That is not on the menu.");
        } else {
            System.out.print("How old are you: ");
            Age = scan.nextInt();
            if (Choice == 1) {
                price = SandWich_Large;
            } else {
                price = SandWich_Regular;
            }


            String WantLoadedmenu = """
                [additional] Do you want the Sandwich loaded:
                     Regular - +1.00
                     Large - +1.75
                """;
            System.out.println(WantLoadedmenu);
            System.out.print("[yes/no]: ");
            String LoadedOption = scan.next();
            if(YesOption.contains(LoadedOption.strip().toLowerCase())) { // if yes
                if (Choice == 1) {
                    price = price + 1.75;
                    System.out.printf("New total %f\n", price);
                } else {
                    ++price;
                    System.out.printf("New total %f\n", price);

                }
            } else if (NoOption.contains(LoadedOption.strip().toLowerCase())) {
                System.out.println("You chose no additional option.");
            }

            if (Age <= 17) {
                discount = 0.10;
            } else if (Age >= 65) {
                discount = 0.20;
            }
            if (discount > 0) {
                price = price - discount;
                System.out.printf("You get a %%%f off\n", discount * 100);
            }
            System.out.printf("The price of the sandwich will be: %f", price);
        }

    }
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want to run excerise 1 or 2: ");
        int Choice = scan.nextInt();
        if (Choice == 1) {
            FirstExcerise();
        } else  if (Choice == 2){
            SecondExercise();
        } else {
            System.out.println("That's not a option");
        }


    }
}
