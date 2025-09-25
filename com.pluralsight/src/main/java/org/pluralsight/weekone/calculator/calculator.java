package org.pluralsight.weekone.calculator;

import java.util.Scanner;

public class calculator
{
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Precise Calculator");

        do { // Keeps repeating back to the top
            System.out.print("Choose a number: ");
            float NumberOne = scan.nextFloat();

            System.out.print("Choose one more number: ");
            float NumberTwo = scan.nextFloat();

            System.out.println("Choose an option: ");
            System.out.println("Addition [+], Subtraction [-], Times [*], Division [/]\nMath Package: Max, Min, Power[^]");
            String Option = scan.next();

            switch (Option.toLowerCase().strip()) { // checks to see what Option they mention and remove white space and lower the Option to lowercase to match.
                case "addition", "add", "+":
                    float result = NumberOne + NumberTwo;
                    System.out.printf("The answer will be %f\n", result);
                    break;
                case "subtraction", "subtract", "-":
                    float resultSubtract = NumberOne - NumberTwo;
                    System.out.printf("The answer will be %f\n", resultSubtract);
                    break;
                case "times", "*", "multiply":
                    float resultTimes = NumberOne * NumberTwo;
                    System.out.printf("The answer will be %f\n", resultTimes);
                    break;
                case "division", "/", "divide":
                    float resultDivision = NumberOne / NumberTwo;
                    System.out.printf("The answer will be %f\n", resultDivision);
                    break;
                case "max", "maximum":
                    float resultMax = Math.max(NumberOne, NumberTwo);
                    System.out.printf("The biggest number is: %f\n", resultMax);
                case "min", "minimum":
                    float resultMin = Math.min(NumberOne, NumberTwo);
                    System.out.printf("The smallest number is: %f\n", resultMin);
                    break;
                case "power", "powers", "^":
                    double resultPower = Math.pow(NumberOne, NumberTwo);
                    System.out.printf("The power number is: %f\n", resultPower);
                    break;
                default:
                    System.out.println("Not a valid answer.");
            }
        } while (true);


    }
}
