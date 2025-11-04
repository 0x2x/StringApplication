package org.pluralsight.Week5.MagicRecap;

public class Wand {
    private String wood;
    private double length;
    private String owner;


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getWood() { return wood;}
    public void setWood(String wood) {
        this.wood = wood;
    }

    public void castSpell(String Target) {
        System.out.println("A spell is cast with a " + wood + " wand! shot at  " + Target);
    }
}
