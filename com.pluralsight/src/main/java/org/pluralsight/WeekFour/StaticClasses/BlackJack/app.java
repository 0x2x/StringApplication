package org.pluralsight.WeekFour.StaticClasses.BlackJack;

import org.pluralsight.WeekFour.StaticClasses.BlackJack.models.Deck;
import org.pluralsight.WeekFour.StaticClasses.BlackJack.models.Hand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class app {
    private static ArrayList<Hand> players = new ArrayList<>();

    static void main() {
        Scanner scan = new Scanner(System.in);
        boolean keepAppOpen = true;
        boolean addedUsers = true;
        System.out.println("Enter \"start\" to start game.");
        boolean startedGame = false;
        int playerNumber = 0;
        int totalPlayers = 0;
        while (keepAppOpen) {
            if(addedUsers) {
                System.out.print("Add new player: ");
            } else if(startedGame){
                // next player
                try{
                    Hand currentPlayer = players.get(playerNumber);
                    System.out.print(currentPlayer.getPlayerName() + "[hit/stand]: ");
                    playerNumber++;
                    if(playerNumber > totalPlayers) {
                        playerNumber = 0;
                    }
                }catch (IndexOutOfBoundsException e) {
                    playerNumber = 0;
                }

            }
            String argument = scan.nextLine();
            switch (argument) {
                case "start":
                    addedUsers = false;
                    startedGame = true;
                    System.out.println("starting game");
                    totalPlayers = players.size();
                    break;
                case "hit":
                    System.out.println("hit");
                    break;
                case "stand":
                    System.out.println("stand");
                    break;
                default:
                    if(addedUsers ==  true) {
                        System.out.println("Added new player: " + argument);
                        Hand player = new Hand();
                        // random cards
                        ArrayList<Deck> cards = new ArrayList<>();
                        Deck deckCards = new Deck();

                        deckCards.hit();
                        cards.add(deckCards);
                        deckCards.hit();
                        cards.add(deckCards);

                        player.setPlayerName(argument);
                        player.setContainedCards(cards);
                        players.add(player);

                    } else {
                        System.out.println("hey");
                    }

            }
        }
    }
}
