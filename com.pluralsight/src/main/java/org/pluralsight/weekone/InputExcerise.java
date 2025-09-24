package org.pluralsight.weekone;

import java.util.Scanner;

public class InputExcerise {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String Animal;
        String Tool;
        int BirthdayDay;

        System.out.print("Whats your favorite animal: ");
        Animal = scan.next();

        System.out.println();
        System.out.print("Whats tool comes to mind: ");
        Tool = scan.next();

        System.out.println();
        System.out.print("Whats your day of birth day: ");
        BirthdayDay = scan.nextInt();

        System.out.printf("Your favorite animal is %s, first tool that comes to mind is a %s and the %d is the day you were born.", Animal, Tool, BirthdayDay);
    }
}
