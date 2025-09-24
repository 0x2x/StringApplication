package org.pluralsight.weekone.calculator;

import java.util.Scanner;

public class calculator
{
    static void main() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Choose a number: ");
            float NumberOne = scan.nextFloat();

            System.out.print("Choose one more number: ");
            float NumberTwo = scan.nextFloat();

            System.out.println("Choose an option: ");
            System.out.println("Addition [+], Subtraction [-], Times [*], Division [/]");
            String Option = scan.next();

            switch (Option.toLowerCase().strip()) {
                case "addition", "add", "+":
                    float result = NumberOne + NumberTwo;
                    System.out.printf("The answer will be %f.2\n", result);
                    break;
                case "subtraction", "subtract", "-":
                    float resultSubtract = NumberOne - NumberTwo;
                    System.out.printf("The answer will be %f.2f\n", resultSubtract);
                    break;
                case "times", "*", "multiply":
                    float resultTimes = NumberOne * NumberTwo;
                    System.out.printf("The answer will be %f.2f\n", resultTimes);
                    break;
                case "division", "/", "divide":
                    float resultDivsion = NumberOne / NumberTwo;
                    System.out.printf("The answer will be %f.2f\n", resultDivsion);
                    break;
                default:
                    System.out.println("Not a valid format.");
            }
        } while (true);


    }
}
