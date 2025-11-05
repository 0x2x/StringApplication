package org.pluralsight.Week7.LambdaMiniExcersies.ExcerciseFour;

public class main {
    static void main() {
        Multiplier result = (nr1, nr2) -> nr1 * nr2;
        System.out.println(result.multiply(4, 6));
    }
}
