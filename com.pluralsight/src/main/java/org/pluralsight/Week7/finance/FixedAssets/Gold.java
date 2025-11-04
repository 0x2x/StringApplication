package org.pluralsight.Week7.finance.FixedAssets;

public abstract class Gold extends FixedAsset{
    double weight;

    public Gold(double weight) {
        super("gold", weight * 1000);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //
    @Override
    public double getValue() {
        return this.weight * marketValue;
    }
}
