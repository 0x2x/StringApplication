package org.pluralsight.weektwo.CalculatorWithMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ThreaterReserverations {
    static void main() {
        String date = "";
        String Name = "";
        int HowManyTickets = 0;
        DateTimeFormatter formatter;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        Name = scan.nextLine();
        System.out.println();
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        date = scan.nextLine();
        System.out.println();
        System.out.print("How many tickets: ");
        HowManyTickets = scan.nextInt();
        System.out.println();

        formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate reservedTime = LocalDate.parse(date.trim().strip(), formatter);

        if(HowManyTickets == 1) {
            System.out.printf("%d ticket reserved for %s under %s", HowManyTickets, reservedTime, ReverseName(Name));

        } else {
            System.out.printf("%d tickets reserved for %s under %s", HowManyTickets, reservedTime, ReverseName(Name));

        }

    }

    private static String ReverseName(String FirstAndLast) {
        String[] FirstAndListSTRsplit = FirstAndLast.split(" ");
        List<String> FirstandListLIST = Arrays.asList(FirstAndListSTRsplit);
        return String.join(", ", FirstandListLIST.reversed());
    }
}
