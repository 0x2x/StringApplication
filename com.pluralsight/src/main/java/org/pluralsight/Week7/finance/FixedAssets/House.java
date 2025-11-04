package org.pluralsight.Week7.finance.FixedAssets;

public abstract class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    // consturcotr
    public House(int yearBuilt, int squareFeet, int bedrooms) {
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return squareFeet * marketValue;
    }

}
