package org.pluralsight.weektwo.CalculatorWithMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FullNameParser {

    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        System.out.print("Full name: ");

        String FullName = scan.nextLine();
        String FullNameTrim = FullName.trim();

        String[] FullNameSplit = FullNameTrim.split(" ");

        // method one
        if (FullNameSplit.length == 3) {
            // contains first, middle, last
            System.out.println("First name: " + FullNameSplit[0]);
            System.out.println("Middle name: " + FullNameSplit[1]);
            System.out.println("Last name: " + FullNameSplit[2]);

        } else if(FullNameSplit.length == 2) {
            System.out.println("First name: " + FullNameSplit[0]);
            System.out.println("Last name: " + FullNameSplit[1]);
        }
        // method two

        // getting first word and last word
        String FirstName = FullNameSplit[0];
        int LastNameIndex = FullNameSplit.length - 1;
        String LastName = FullNameSplit[LastNameIndex];
        String MiddleName = "(NONE)";
        if(FullNameSplit.length > 2) {
            List<String> list = new ArrayList<String>();
            for (String name : FullNameSplit) {
                list.add(name);
            }

            list.removeFirst();
            list.remove(LastNameIndex - 1);

            System.out.println("First name: " + FirstName);
            System.out.println("Middle names: " + String.join(" ", list));
            System.out.println("Last name: " + LastName);

        }else {
            System.out.println("First name: " + FirstName);
            System.out.println("Middle name: " + MiddleName);
            System.out.println("Last name: " + LastName);

        }



    }
}
