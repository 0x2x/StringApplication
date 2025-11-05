package org.pluralsight.Week7.LambdaMiniExcersies.ExcerciseThree;

public class ExcerciseThree {
    static void main() {
        Calculator add = (a, b) -> a + b;
        System.out.println(add.add(1,2));
    }
}
