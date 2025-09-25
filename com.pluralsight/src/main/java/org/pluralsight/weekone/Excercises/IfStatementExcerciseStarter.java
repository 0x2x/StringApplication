package org.pluralsight.weekone.Excercises;

public class IfStatementExcerciseStarter {

    static void main() {
        /*
        1.Positive number Write a program that checks if a number is greater than 0. 👉 If yes, print "Positive number", otherwise "Not positive".
         */

        int number = 0;
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Not positive.");
        }
        /*
        Even or odd Given an integer, check if it’s even or odd. 👉 Print "Even" if divisible by 2, otherwise "Odd".
         */
        int EvenOrOdd = 2;
        int result = EvenOrOdd / 2;
        if (result % 2 == 0) {
            System.out.printf("%d is a even number.", result);
        } else {
            System.out.printf("%d is an odd number", result);
        }
        /*
        Temperature check Check if the temperature is higher than 25. 👉 Print "Hot" if true, otherwise "Not hot".
         */

        int Tempature = 25;
        if (Tempature > 25) {
            System.out.printf("hot");
        } else {
            System.out.println("Not hot");
        }
        /*
        Teenager check Given an age, check if it is between 13 and 19 (inclusive). 👉 Print "Teenager" or "Not a teenager".
         */
        int TeenAgeCheck = 20;
        if (TeenAgeCheck >= 13 && TeenAgeCheck <= 19) {
            System.out.println("teenager");
        } else {
            System.out.println("Not a teenager");
        }

        /*
        Voting age Given an age, check if the person is allowed to vote (18 or older). 👉 Print "Can vote" or "Too young to vote".
         */
        int canVoteAge  = 16;
        if (canVoteAge >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("can't vote");
        }
        /*
        Divisible by 3 and 5 Given a number, check if it is divisible by both 3 and 5. 👉 Print "Divisible by 3 and 5" or "Not divisible by 3 and 5".
         */
        int DivisibleNumber = 2;
        if (DivisibleNumber % 3 == 0 && DivisibleNumber % 5 == 0) {
            System.out.println("divisible by 3 and 5");
        } else {
            System.out.println("Not divisible by 3 and 5");
        }
        /*
        Safe speed Given a speed, check if it is below 30 or above 100. 👉 If true, print "Unsafe speed", otherwise "Safe speed".
         */
        int SafeSpeed = 55;
        if (SafeSpeed < 30 || SafeSpeed > 100) {
            System.out.println("Unsafe speed");
        } else {
            System.out.println("Safe speed");
        }
        /*
        Leap year (simple version) Given a year, check if it is divisible by 4 and not divisible by 100. 👉 Print "Leap year" or "Not leap year". (We’ll ignore the full leap-year rules for now.)
         */
        int Year = 2025;
        if (Year % 4 == 0 && Year % 100 != 0) {
            System.out.println("Leap year");
        } else  {
            System.out.println("Not leap year");
        }

        /*
        Pass or fail Given a score, check if it is at least 50. 👉 Print "Pass" or "Fail".
         */
        int PassOrFail = 55;
        if (PassOrFail > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
