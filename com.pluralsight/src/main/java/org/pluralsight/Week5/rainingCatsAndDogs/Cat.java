package org.pluralsight.Week5.rainingCatsAndDogs;

public class Cat {
    private int age;
    private String color;
    private int numberOfLegs;
    private String name;
    private String breed;
    private String from;
    private int totalMeows;
    // Consturctor
    public Cat(int age, String color, int numberOfLegs, String name, String breed, String from) {
        this.age = age;
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        this.breed = breed;
        this.from = from;
    }
    //

    public void meow() {
        System.out.println(this.name + ": meow");
        this.totalMeows += 1;
    }

    public void meowCount() {
        System.out.println(this.name + " Total Meows: " + this.totalMeows);
    }

    public String introduction() {
        System.out.println(this.name + ": meow meow meow meow meow meowmeow meow meowmeow meow meowmeow meow meowmeow meow meowmeow meow meow");
        System.out.println("Translation: ");
        return "Hi, my name is " + this.name + " " +
                "I am from " + from + " " +
                "my breed is " + breed + " and I am " + age + " old" +
                " " + "I have " + this.numberOfLegs + " legs";
    }
}
