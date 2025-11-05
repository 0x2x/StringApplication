package org.pluralsight.Week7.LambdaMiniExcersies.ExcericseSix;

public class main{
    static void main() {
        noParams greeter = () -> System.out.println("hey");
        greeter.printRandom();
    }
}
