package org.pluralsight.weektwo.CalculatorWithMethods;

public class compareNumbers {
    static void main() {
        // calling functions and using variables
        boolean numberIsEven = isEven(4);
        System.out.println(numberIsEven);
        boolean isNumberPostive = isPositive(-5);
        System.out.println(isNumberPostive);


        // calling functions within print
        System.out.println(isEven(24));
        System.out.println(isPositive(44));
    }

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    private static boolean isPositive(double number) {
        if (number > 0 ) { return true; }
        return false;
    }
}
