package org.pluralsight.weektwo.CalculatorWithMethods.CreatingCLIAPp;

import java.util.Scanner;

public class MyApplication {
    private static int Age;
    private static String Name;

    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Whats your name");
        Name = scan.nextLine();

        CanVote(scan);

    }

    private static boolean CanVote(Scanner scan) {
        System.out.println("Whats your age");
        Age = scan.nextInt();
        return Age >= 18;
    }

    private static void SameName(String PersonName) {
        if(PersonName.equalsIgnoreCase("alice")) {
            System.out.println("Welcome " + PersonName);
        } else {
            System.out.println("Hi, " + PersonName);
        }
    }

    private static void AgeandName(String PersonName, int PersonAge){
        if (PersonAge >= 21 && PersonName.equalsIgnoreCase("bob")) {
            System.out.println("You can drink");
        } else if(PersonName.equalsIgnoreCase("bob") || PersonAge <= 21) {
            System.out.println("You cant drink");
        }
    }

    private static double SquareRoot(double NumberOne) {
        return Math.sqrt(NumberOne);
    }

    private static void SwitchStatement(String PersonName) {
        switch (PersonName.toLowerCase()) {
            case "bob":
                System.out.println("Hi bob, want to get a drink");
                break;
            case "alice":
                System.out.println("Welcome Alice!");
                break;
            default:
                System.out.println("Hey dude.");
        }
    }

    private static boolean ternaryOperator(String userName) {
        return userName.equals("Lara") ? true : false;
    }

    private static double MaxNumber(double A, double B) {
        return Math.max(A, B);
    }

    private static double RandomNumberGenerator(double Max) {
        return Math.round(Math.random() * Max);
    }

    private static double SmallestNumber(double A, double B) {
        return Math.min(A, B);
    }
}
