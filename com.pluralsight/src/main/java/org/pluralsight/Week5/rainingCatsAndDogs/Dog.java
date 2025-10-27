package org.pluralsight.Week5.rainingCatsAndDogs;

public class Dog {
    private int age;
    private String color;
    private int numberOfLegs;
    private String name;
    private String breed;
    private String from;
    // Constructor
    public Dog(int age, String color, int numberOfLegs, String name, String breed, String from) {
        this.age = age;
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        this.breed = breed;
        this.from = from;
    }

    // method
    public void bark() {
        System.out.println(this.name + ": BARK!");
    }
    public String introduction() {
        System.out.println(this.name +  ": BARK BARK BARK BARk BARK BARK BARK BARkBARK BARK BARK BARkBARK BARK BARK BARk BARK BARK BARK BARkBARK BARK BARK BARk");
        System.out.println("Translation: ");
        return "Hi, my name is " + this.name + " " +
                "I am from " + from + " " +
                "my breed is " + breed + " and I am " + age + " old" +
                " " + "I have " + this.numberOfLegs + " legs";
    }
}
