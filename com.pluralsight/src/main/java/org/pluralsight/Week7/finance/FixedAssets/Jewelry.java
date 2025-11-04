package org.pluralsight.Week7.finance.FixedAssets;

public abstract class Jewelry extends FixedAsset{
    private double Karat;

    public Jewelry(String name, double karat) {
        super(name, karat);
    }


    @Override
    public double getValue() {
        return Karat * marketValue; // if marketValue is per Karat
    }
}
