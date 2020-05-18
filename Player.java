/*
*
* @author Sarah Hancock, seh2209
* @date 11/27/2019
*
* This class represents a player in the poker game.
*
*/

import java.util.ArrayList;

public class Player {
    
	private ArrayList<Card> hand; 
	private double bankroll;
    private double bet;

    /*  
	 * Creates a player with an empty hand and a starting bankroll of 20 tokens.
	*/
	public Player() {	
        hand = new ArrayList<Card>();
        bankroll = 20;
        bet = 0;
	}
    
    /*  
	 * Adds a card to the player's hand.
	*/
	public void addCard(Card c){
	    hand.add(c);
	}

    /*  
	 * Removes a card from the player's hand.
	*/
	public void removeCard(Card c){
        hand.remove(c);
    }
    
    /*  
	 * Sets the player's bet to the specified amount, 
	 * and subtracts the bet from the bankroll.
	*/
    public void bets(double amt){
        bet = amt;  
        bankroll -= bet;
    }
    
    /*  
	 * Adds the player's winnings 
	 * (their bet multiplied by the payout of their hand) 
	 * to their bankroll.
	*/
    public void winnings(double odds){
        bankroll = bankroll + bet * odds;      
    }
    
    /*  
	 * Accesses the private variable bankroll.
	*/
    public double getBankroll(){
        return bankroll;
    }
  
    /*  
	 * Accesses the private variable bet.
	*/
    public double getBet(){
        return bet;
    }
    
    /*  
	 * Accesses the private variable hand.
	*/
    public ArrayList<Card> getHand(){
        return hand;
    }
    
    /*  
	 * Reads the player's hand with each card as a new line.
	*/
    public void readHand(){
        for (int i = 0; i < 5; i++) {
            System.out.println(hand.get(i));
        }
    }
    
    
}


