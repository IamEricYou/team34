package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Assignment 1: Each of the blank methods below require implementation to get AcesUp to build/run
 */
public class Game {

    public Deck d;
    //public java.util.List<java.util.List<Card>> cols = new ArrayList<>(4);
    public Player p;

    public Game(){
        /*initialize a new game such that each column can store cards
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());*/
        d = new Deck();
        p = new Player();
    }

  /*  public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
*/
    public void dealFour() {
    	System.out.print("inside deal four function");
        // remove the top card from the deck and add it to a column; repeat for each of the four columns
        int elements = d.deck.size();
        if(elements >= 4){
            for(int i = 0; i < 4; i++){
                p.cols.get(i).add(d.deck.get(0));
                d.deck.remove(0);
            }
        }else{
            System.out.print("out of cards");
        }
    }

  /*  public void remove(int columnNumber) {
        // remove the top card from the indicated column
    	if(this.cols.get(columnNumber).size() > 0)
    		removeCardFromCol(columnNumber);
    }*/
}
  /*  private boolean columnHasCards(int columnNumber) {
    	if(cols.get(columnNumber).isEmpty()) {
    		return false;
    	}
        // check indicated column for number of cards; if no cards return false, otherwise return true
        return true;
    }

    public Card getTopCard(int columnNumber) {
        return this.cols.get(columnNumber).get(this.cols.get(columnNumber).size()-1);
    }


    public void move(int columnFrom, int columnTo) {

	// if no cards on the column from, this function does nothing
    	// remove the top card from the columnFrom column, add it to the columnTo column
    	if((columnHasCards(columnFrom))){
    		Card topcard = getTopCard(columnFrom); //this knows what card is moving.
    		removeCardFromCol(columnFrom);
    		addCardToCol(columnTo,topcard);
    	}
    }

    private void addCardToCol(int columnTo, Card cardToMove) {
        cols.get(columnTo).add(cardToMove);
    }

    private void removeCardFromCol(int colFrom) {
        this.cols.get(colFrom).remove(this.cols.get(colFrom).size()-1);
    }
}*/
