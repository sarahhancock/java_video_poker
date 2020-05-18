This program is used to play a simple Video Poker game.

First, the class Card.java represents a card in the game. 

Each card has a rank (1-13) and a suit (1-4). To make the cards easier to understand, each card also has a c
haracter and unicode symbol corresponding to the suit number (i.e clubs has suit 1, suitChar c, 
and suitSym '\u2663'--the clubs symbol).
Cards have a compareTo method which compares cards using their ranks, but not their suits.

The class Deck.java represents a 52-card deck.

Deck has a shuffle method which iterates through the deck, swapping each card with another
random card in the deck.
It also has a deal method which returns the top card in the deck and moves the top of the deck index to 
the next card in the deck.

The class Player.java represents a player in the game.

A player has a bankroll that starts at 20 tokens, as well as a bet and a hand of cards. 
The player can add a card to its hand, remove a card from its hand, and place a bet, which happens
at the start of a round in Game.java. When the player wins, its bankroll is adjusted based on the bet 
it placed and the value of the hand it has.
The Player class also has several accessor methods so that its private variables can be retrieved during 
gameplay (for example, to look at the value of the bankroll).

Finally, the class Game.java represents the game itself.

There are two Game constructors - one that takes in no parameters and is used to play a normal game, 
and one that takes in a String array in which each string is a char representing the suit of a card, followed
by the rank as an integer. The Card constructor can take in such a string and create a card object, so this
second Game constructor uses this property of the Card class to create an initial hand for the player.
The Game class also has a dealHand method which creates a random hand for the player.

The checkHand method is used to find the value of the player's hand. It uses several helper methods,
including isRoyal, isStraight, isFlush, and findFrequencies. The findFrequencies method uses a HashMap
to find the frequency of each card, and then calculate the number of pairs, three of a kind, and four
of a kind based on these frequencies.
The checkHand method also changes the player's bankroll using the "winnings" method, since the only time 
a hand is checked is at the end of the round when it is determined what the player has won.

The play method is used to actually play the game. It starts each round over until the player replies
that it does not want to keep playing, or the player runs out of money. Each round starts with the player
placing a bet, which is then subtracted from its bankroll. Then, the player is shown its hand and can
decide which cards to switch out. If the player decides to switch a card out, the card is removed 
from the players' hand, and a new card is added to the hand; however, the switching can only occur once
the player has indicated its switching choice for all of its cards, so a separate ArrayList is created
to hold the cards to be switched.

After the cards are switched, the player is shown its new hand. The value of the player's new hand is 
calculated using the checkHand method, and its bankroll is modified, also via the checkHand method.
The player is shown its new bankroll. If the bankroll is <= 0, the player is out of money, so the game
exits. Otherwise, the player is asked if it wants to keep playing. If the player answers "yes", a new 
round begins, and otherwise, the game exits.

The class PokerTest.java can be used to test the game.