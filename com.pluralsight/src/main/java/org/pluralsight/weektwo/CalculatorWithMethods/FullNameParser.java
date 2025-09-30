package org.pluralsight.weektwo.CalculatorWithMethods;

import java.util.Scanner;

public class FullNameParser {

    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        System.out.print("Full name: ");

        String FullName = scan.nextLine();


        String[] FullNameSplit = FullName.split(" ");
        if (FullNameSplit.length == 3) {
            // contains first, middle, last
            System.out.println("First name: " + FullNameSplit[0]);
            System.out.println("Middle name: " + FullNameSplit[1]);
            System.out.println("Last name: " + FullNameSplit[2]);

        } else if(FullNameSplit.length == 2) {
            System.out.println("First name: " + FullNameSplit[0]);
            System.out.println("Last name: " + FullNameSplit[1]);
        }

    }
}
