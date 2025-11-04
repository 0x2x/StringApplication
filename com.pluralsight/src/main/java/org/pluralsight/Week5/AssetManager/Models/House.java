package org.pluralsight.Week5.AssetManager.Models;

public class House extends Asset {


    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;


    public House() {
        super();
    }
    public House(String address, int condition, int squareFoot, int lotSize) {
        super();
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    // getters and setters


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        double originalCost = getOriginalCost();
        double estimatedCost = 0;
        if(condition == 1) {
            estimatedCost = getSquareFoot() * 180;
        } else if (condition == 2) {
            estimatedCost = getSquareFoot() * 130;

        } else if (condition == 3) {
            estimatedCost = getSquareFoot() * 90;

        } else if (condition == 4){
            estimatedCost = getSquareFoot() * 80;
        }
        estimatedCost += getSquareFoot() * 0.25;
        originalCost -= estimatedCost;
        setOriginalCost(originalCost);
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
