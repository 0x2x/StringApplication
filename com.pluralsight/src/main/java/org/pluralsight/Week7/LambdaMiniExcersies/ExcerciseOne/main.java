package org.pluralsight.Week7.LambdaMiniExcersies.ExcerciseOne;

public class main {
    static void main() {
        Hello hello = () -> System.out.println("Hi from java!");
        hello.sayHello();
    }
}
