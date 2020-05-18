/*
*
* @author Sarah Hancock, seh2209
* @date 11/27/2019
*
* This class represents a deck of cards in the poker game
*
*/

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private Card[] cards = new Card[52];
	private int top; 
	
    /*  
	 * Creates a deck of 52 cards with
	 * 4 different suits and 13 ranks within each suit.
	*/
	public Deck(){
        this.top = 0;
        int i = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <=13; rank++) {
                cards[i] = new Card(suit, rank);
                i++;
            }
        }
    }
	
    /*  
	 * Shuffles the deck.
	*/
	public void shuffle(){
        Random rand = new Random();
        int iSwap;
        Card temp;
        for (int i = 0; i < cards.length; i++) {
            iSwap = rand.nextInt(cards.length);
            temp = cards[iSwap];
            cards[iSwap] = cards[i];
            cards[i] = temp;
        }
	}
	
    /*  
	 * Deals a card from the deck, and adjusts the top
	 * of the deck to the next card in the deck.
	*/
	public Card deal(){
        if (top == 52) {
            System.out.println("The deck is empty.");
            return null;
        }
        return this.cards[top++];
	}

}
