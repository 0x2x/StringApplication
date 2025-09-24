package org.pluralsight;

public class ChallengeOne {
    static void main() {
        // Challenge A
        /*
        Challenge A: Double Trouble
            Create an double with any value you like.
            Multiply it by 2.
            Print both the original and the doubled value.

*/
        double X = 40;
        double x_Times_two = X * 2;
        System.out.println("Original: " + X);
        System.out.println("Doubled: " + x_Times_two);
        // Challenge B
        /*
        🔹 Challenge C: Random Surprise
            Generate a random number between 0 and 10.
            Print it.
            Add 5 to it and print the new value.
         */

        String name = "Nigel";
        int FavoriteNumber = 67;
        System.out.println("My name is " + name + " My favorite number is " + FavoriteNumber);
        // Challenge C
        /*
        🔹 Challenge C: Random Surprise
            Generate a random number between 0 and 10.
            Print it.
            Add 5 to it and print the new value.
         */
        int random = (int) Math.round(Math.random() * 10);
        System.out.println("result " + random);
        int random_plus_five = (random + 5);
        System.out.println(random_plus_five);
        // Bonus 1
        /*
        🔹 Bonus 1: Clock Math ⏰
            Take a number of hours (e.g. 27) and calculate what hour that would be on a 24-hour clock. Use % 24.

            Example:
         */
        int hours = 15;
        int total_hours = 24;
        int result = total_hours % hours;
        System.out.println(result);
        // bonus 2
        /*
        🔹 Bonus 2: Minutes to Hours and Minutes ⏳
            Take a number of minutes (e.g. 130) and figure out how many full hours and leftover minutes that is.

            Hours = minutes / 60
            Leftover = minutes % 60
         */
        int TotalNumberOfMins = 155;
        int hours1 = TotalNumberOfMins / 60;
        int leftOver = TotalNumberOfMins % 60;
        System.out.println(TotalNumberOfMins + " minuites" + " = " + hours1 + " and " + leftOver + " minutes");

        // bonus 3

        int startingHours = 4;
        int startingMinutes = 56;
        int minutesToAdd = 183;

        int newHours = (minutesToAdd + startingMinutes) / 60 + startingHours;
        int newMins = (minutesToAdd + startingMinutes) % 60;

        System.out.println("Start time: " + startingHours + ":" + startingMinutes);
        System.out.println("Minutes to add: " + minutesToAdd);
        System.out.println("Final time: " + newHours + ":" + newMins);


    }
}
