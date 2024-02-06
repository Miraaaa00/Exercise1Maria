package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Maria Kristina Miranda
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        // Fill magicHand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card(Card.SUITS[(int) (Math.random() * 4)], (int) (Math.random() * 13) + 1);
            magicHand[i] = c;
        }

        // Print the magicHand
        for (Card card : magicHand) {
            System.out.println(card.getSuit() + " " + card.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter a suit (0-3 where 0-Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuitIndex = scanner.nextInt();

        if (userSuitIndex < 0 || userSuitIndex >= Card.SUITS.length) {
            System.out.println("Invalid suit index entered.");
            return;
        }

        String userSuit = Card.SUITS[userSuitIndex];

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
        }

        // result
        if (found) {
            System.out.println("Congratulations, your card is in the magic hand!");
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }

    public static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Maria Kristina Miranda, You can call me Maria!!");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println(" I would like to be a Cyber Security");
        System.out.println(" Travel the world");
        System.out.println(" Have a charity organization for children");
        System.out.println();    

        System.out.println("My hobbies:");
        System.out.println(" Hiking");
        System.out.println(" Reading");
        System.out.println(" Dancing");

        System.out.println();
    }
}


    


    
 

