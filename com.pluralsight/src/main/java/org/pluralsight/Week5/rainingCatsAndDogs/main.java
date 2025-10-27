package org.pluralsight.Week5.rainingCatsAndDogs;

public class main {
    static void main() {
        Dog dog = new Dog(13, "black", 4, "indie", "Rat Terrior Mix", "Kentucky");
        Cat catOne = new Cat(3, "Grey-Brown", 4, "Merc", "Some type of cat", "Construction site in Seattle");
        Cat catTwo = new Cat(3, "Grey-Stripes", 4, "Ringo", "Some type of cat", "Construction site in Seattle");
        dog.bark();
        catOne.meow();
        catOne.meow();
        catOne.meow();
        catOne.meow();
        catOne.meow();

        catTwo.meow();
        System.out.println(dog.introduction());;
        System.out.println(catOne.introduction());;
        System.out.println(catOne.introduction());;


        catOne.meowCount();

    }
}
