package org.pluralsight.Week7.finance.FixedAssets;

import org.pluralsight.Week7.finance.Valuable;

public abstract class FixedAsset implements Valuable {
    private String name;
    protected double marketValue;

    // constructors
    public FixedAsset() {}
    public FixedAsset(String Name, double marketValue) {
        this.name = Name;
        this.marketValue = marketValue;
    }
    // regular methods
    public void Asset(String name, double value) {

    }

    public abstract double getValue();

}
