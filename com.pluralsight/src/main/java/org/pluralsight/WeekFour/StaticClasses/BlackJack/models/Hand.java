package org.pluralsight.WeekFour.StaticClasses.BlackJack.models;

import java.util.ArrayList;

public class Hand {
    public String getPlayerName() {
        return playerName;
    }

    private String playerName;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<Deck> getContainedCards() {
        return containedCards;
    }

    public void setContainedCards(ArrayList<Deck> containedCards) {
        this.containedCards = containedCards;
    }

    private ArrayList<Deck> containedCards;
}
