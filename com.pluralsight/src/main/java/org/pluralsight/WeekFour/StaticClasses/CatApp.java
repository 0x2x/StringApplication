package org.pluralsight.WeekFour.StaticClasses;

public class CatApp {
    static void main() {

        // sets it for the class
        Cat cat = new Cat();
        System.out.println(Cat.getCatCount());
        Cat catTwo = new Cat();
        System.out.println(Cat.getCatCount());
        Cat catThree = new Cat();
        System.out.println(Cat.getCatCount());



        // setting names for each cat
        cat.setCatName("kitty");
        catThree.setCatName("doggy");
        catTwo.setCatName("little kitty");

        System.out.println(cat.getCatName());

    }
}
