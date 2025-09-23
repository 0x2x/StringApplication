package org.pluralsight;

public class MathClassExamples {
    static void main() {
        int a = 15, b = 20;
        int minValue = Math.min(a, b);
        System.out.println(minValue + " Is the smallest number");

        int maxValue = Math.max(a, b);
        System.out.println(maxValue + " Is the biggest number");

        double d = 6.7;
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.round(d));

        double randomMathValue = Math.random();
        System.out.println(randomMathValue);

        // be specific
        // Math.random generates
        int number = (int) Math.round(Math.random()  * 100); // randomize numbers from 0 - 100;
        // (int) casts
        System.out.println(number);

        // PI
        double pie = Math.PI;
        System.out.println(pie);
        //
        double sin = Math.sin(a);
        System.out.println(sin);
    }
}
