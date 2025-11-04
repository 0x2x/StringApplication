package org.pluralsight.Week5.AssetManager.Models;

public class Asset {
    private String Description;
    private String dateAquired;
    private double originalCost;
    // Getters and Setters
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDateAquired() {
        return dateAquired;
    }

    public void setDateAquired(String dateAquired) {
        this.dateAquired = dateAquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public double getValue() {
        return this.originalCost;
    }

    // Constructor
    public Asset() {}
    public Asset(String description, String dateAquired, double originalCost) {
        Description = description;
        this.dateAquired = dateAquired;
        this.originalCost = originalCost;
    }

}
