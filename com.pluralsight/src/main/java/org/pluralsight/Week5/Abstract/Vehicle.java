package org.pluralsight.Week5.Abstract;

import java.time.LocalDateTime;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    // Constructor
    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }
    public Vehicle() {
        super();
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        int currentYear = LocalDateTime.now().getYear();
        int totalYears = currentYear - year;
        double cost = getOriginalCost();
        double removeValue = 0;

        if(totalYears <= 3 && totalYears >= 0) {
            removeValue = cost * 0.3;
        } else if(totalYears <= 6 && totalYears >= 4) {
            removeValue = cost * 0.6;

        } else if(totalYears <=10 && totalYears >=7) {
            removeValue = cost * 0.8;
        } else if(totalYears > 10) {
            removeValue = cost - 1000;
        }
        if(getOdometer() > 100_000 && !makeModel.contains("honda") || !makeModel.contains("toyota")) {
            removeValue = cost * 0.25;
        }
        setOriginalCost(removeValue);
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    // regular methods
    @Override
    public double getValue() {
        return getOriginalCost();
    }
}
