package org.pluralsight.Week5.MagicRecap;

import java.util.ArrayList;

public abstract class Wizard {
    private String house;
    private String name;
    private int age;
    private ArrayList<Wand> wands = new ArrayList<>();

    public Wizard(String name) {
        this.name = name;
    }

    public Wizard(String house, String name, int age, ArrayList<Wand> wands) {
        this.house = house;
        this.name = name;
        this.age = age;
        this.wands = wands;
    }

    public ArrayList<Wand> getWands() {
        return wands;
    }

    public void addWand(Wand wand) {
        wands.add(wand);
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void castSpell();


}
