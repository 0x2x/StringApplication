package org.pluralsight.Week7.LambdaMiniExcersies.ExcerciseTwo;

public class main{
    static void main() {
        Greeter greeter = (name) -> System.out.println("Hi " + name + "! have a great day!");
        greeter.greet("jessica");

    }
}
