package org.pluralsight.WeekFour.StaticClasses.BlackJack.models;

public class Deck {
    private int totalCount;

    public static int getCurrentCardNumber() {
        return currentCardNumber;
    }

    public static void setCurrentCardNumber(int currentCardNumber) {
        Deck.currentCardNumber = currentCardNumber;
    }

    private static int currentCardNumber;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    // consturctor
    public Deck() {}

    // regular methods
    public int hit() {
        int randomNumber = (int) Math.round(Math.random() * 8);
        int newResult = randomNumber;
        setCurrentCardNumber(randomNumber);
        return newResult;
    }
}
