package exercise1;

import java.util.*;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Carey Cunningham 2023-01-31
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        int     userInputCard;
        String  userInputSuit;
        boolean match = false;
        Card[]  hand = new Card[7];

        // create a random object
        Random rand = new Random();
        
        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue(rand.nextInt(13));            
            hand[i].setSuit(Card.SUITS[rand.nextInt(4)]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a card number (1-13) (Ace=1, Jack=11, Queen=12, King=13: ");
        userInputCard = sc.nextInt();

        System.out.print("Please enter a suit (Hearts, Diamonds, Spades or Clubs): ");
        userInputSuit = sc.next();
        
        for (int i=0; i < hand.length; i++) {
            if (userInputSuit.equalsIgnoreCase( hand[i].getSuit()) && userInputCard == hand[i].getValue()) {
                match = true;
            }
        }
        if (match) { printInfo(); }
        else {
            System.out.printf("You lose this time, your guess was %d of %s\n", userInputCard, userInputSuit);
            System.out.println("The 7 random cards were:");
            for (int i=0; i < hand.length; i++){
                System.out.printf("%d of %s\n", hand[i].getValue(), hand[i].getSuit());
            }
        }      
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
