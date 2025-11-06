package org.pluralsight.Week7.LambdaMiniExcersies.ExcericseSix;

public class main{
    static void main() {
        RandomPrinter greeter = () -> System.out.println(Math.round(Math.random() * 10));
        greeter.printRandom();
    }
}
