package org.pluralsight.weekone.calculator;

import java.util.Scanner;

public class calculator
{
    static void main() {

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Choose a number: ");
            float NumberOne = scan.nextFloat();

            System.out.print("Choose one more number: ");
            float NumberTwo = scan.nextFloat();

            System.out.println("Choose an option: ");
            System.out.println("Addition, Subtraction, Times, Division");
            String Option = scan.next();

            switch (Option.toLowerCase().strip()) {
                case "addition":
                    float result = NumberOne + NumberTwo;
                    System.out.printf("The string will be %f", result);
                    break;
                case "subtraction":
                    float resultSubtract = NumberOne - NumberTwo;
                    System.out.printf("The string will be %f", resultSubtract);
                    break;
                case "times":
                    break;
                case "division":
                    break;
                default:
                    System.out.println("Not a valid format.");
            }

        }


    }
}
