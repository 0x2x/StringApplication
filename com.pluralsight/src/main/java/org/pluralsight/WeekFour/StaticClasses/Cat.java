package org.pluralsight.WeekFour.StaticClasses;

public class Cat {
    private String name;
    private static int catCount;

    public static int getCatCount() {
        return catCount;
    }
    public void setCatName(String name) {
        this.name = name;
    }
    public String getCatName() {
        return name;
    }
    public Cat() {
        catCount++;
    }
}
