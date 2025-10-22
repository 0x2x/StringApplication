package org.pluralsight.WeekFour.UnitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;
    private Player playerTwo;

    @BeforeEach
    void init() {
        player = new Player("Nigel");
        playerTwo = new Player("Jeff", 15);

    }

    @Test
    void player_ReturnStartingPoint() {
        // act
        int currentScore = player.getScore();
        // assert
        assertEquals(0, currentScore);
    }

    @Test
    void player_AddPointsFromStart() {
        // act #1
        int currentScore = player.getScore();

        // assert #1
        assertEquals(0, currentScore); // check to see if it starts at 0

        // act #2
        player.AddPoints(15);
        int newScore = player.getScore();

        // assert #2
        assertEquals(15, newScore);
    }

    @Test
    void player_AddPointsFromPointsExisting() {
        // arrange
        int currentScorePlayerOne = player.getScore();
        int currentScorePlayerTwo = playerTwo.getScore();

        // act #1
        int getNewScore = player.AddPoints(15);
        int getNewScorePlayerTwo = playerTwo.AddPoints(15);

        // assert #1
        assertEquals(15, getNewScore);
        assertEquals(30, getNewScorePlayerTwo);

    }


}