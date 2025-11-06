package org.pluralsight.Week7.LambdaMiniExcersies.ExcerciseSeven;

public class main{
    static void main() {
        ExplicitInferred greeter = (nr1, nr2) -> nr1 / nr2;
        System.out.println(greeter.divide(4, 5));
    }
}
