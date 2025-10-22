package org.pluralsight.WeekFour.UnitTesting;

public class Player {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Consturcotrs
    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public Player(String name, int score) {
        this.name = name;
        score = score;
    }

    // regular method
    public int AddPoints(int addPoints) {
        score += addPoints;
        return score;
    }

}
