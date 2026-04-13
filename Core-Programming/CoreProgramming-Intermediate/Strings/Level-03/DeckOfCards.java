// 10. Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute
// the deck of n cards to x number of players. Finally, print the cards the players have.
// Hint =>
// a. Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks
// from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
// b. Calculate the number of cards in the deck and initialize the deck
// int numOfCards = suits.length * ranks.length;
// c. Write a Method to Initialize the deck of cards with suits and ranks and return the deck.
// The deck is an array of strings where each string represents a card in the deck
// represented as "rank of suit" e.g., "2 of Hearts"
// d. Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the
// card iterate over the deck and swap each card with a random card from the remaining
// deck to shuffle the deck. Please find the steps below
// Step1: Use for Loop Iterate over the deck and swap each card with a random card from
// the remaining deck
// Step 2: Inside the Loop Generate a random card number between i and n using the
// following code
// int randomCardNumber = i + (int) (Math.random() * (n - i));
// Step 3: Swap the current card with the random card
// e. Write a Method to distribute the deck of n cards to x number of players and return the
// players. For this Check the n cards can be distributed to x players. If possible then
// Create a 2D array to store the players and their cards
// f. Write a Method to Print the players and their cards

import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class DeckOfCards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        String[] deck = deckCreation(suits, ranks);
        System.out.println("Deck: " + Arrays.toString(deck));

        deck = cardShuffle(deck);
        System.out.println("\nShuffled Deck: " + Arrays.toString(deck));

        System.out.print("\nEnter number of players: ");
        int playerNum = sc.nextInt();

        if (deck.length % playerNum != 0) {
            System.out.println("Cards cannot be equally distributed!");
            return;
        }


        String[][] players = cardDistribution(deck, playerNum);
        display(players);

    }

    // Deck creation
    public static String[] deckCreation(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[idx++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Shuffle deck
    public static String[] cardShuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int)(Math.random() * (deck.length - i));

            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        return deck;
    }

    // Distribute cards
    public static String[][] cardDistribution(String[] deck, int players) {

        int cardsPerPlayer = deck.length / players;

        String[][] result = new String[players][cardsPerPlayer];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[index++];
            }
        }

        return result;
    }

    // Display cards
    public static void display(String[][] players) {

        System.out.println("\n--- Cards Distribution ---");

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }
}