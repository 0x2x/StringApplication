package org.pluralsight.weektwo.CalculatorWithMethods;

import java.util.Scanner;

public class FullNameGenerator {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Whats your first name: ");
        System.out.print("First name: ");
        String FirstName = scan.nextLine();
        System.out.println("Whats your Middile Name:");
        System.out.print("Middle name: ");
        String MiddleName = scan.nextLine();
        System.out.println("Whats your Last Name:");
        System.out.print("Last name: ");
        String LastName = scan.nextLine();
        System.out.println("Whats your Suffix:");
        System.out.print("Suffix: ");
        String Suffex = scan.nextLine().trim();

        if(!Suffex.isEmpty()) {
            Suffex = String.format(", %s", Suffex);
        }

        String Result = String.format("%s %s %s%s", FirstName.trim().strip(), MiddleNameShorten(MiddleName.trim().strip()), LastName.trim().strip(), Suffex.trim().strip());
        System.out.println("Full name: " + Result);

    }

    private static String MiddleNameShorten(String middleName) {
        if(!middleName.isEmpty()) return middleName.strip().toUpperCase().charAt(0) + ".";
        return "";
    }
}
