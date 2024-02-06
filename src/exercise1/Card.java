package exercise1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Maria Kristina Miranda February 6, 2024
 */
public class Card {

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit; 
        this.value = value;
    }

    public String getSuit() {  
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
