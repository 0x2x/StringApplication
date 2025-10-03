package org.pluralsight.weektwo.RollTheDice;

public class dice {
    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    private int randomNumber;

    public int roll(int minValue, int max) {
        randomNumber = (int)(Math.random() * max) + minValue;
        return randomNumber;
    }
}
