package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Assignment 1: Each of the blank methods below require implementation to get AcesUp to build/run
 */
public class Game {

    public java.util.List<Card> deck = new ArrayList<>();
    public java.util.List<java.util.List<Card>> cols = new ArrayList<>(4);

    Card card;
    public Game(){
        //initialize a new game such that each column can store cards
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
    }

    public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }

    public void shuffle() {
        System.out.print("shuffle");
        //has bad server error 
	// shuffles the deck so that it is random
        /*java.util.List<Card> new_deck = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 52; i++){
            int j = rand.nextInt(52);
                int placed = 0;
                while(placed == 0){
                    if(new_deck.get(j).equals(null)){
                        placed = 1;
                        new_deck.set(j, this.deck.get(i));
                    }else{
                        if(j == 51){
                            j = 0;
                        }else{
                            j = j + 1;
                        }
                    }
                }
        }
        for(int i = 0; i < 51; i++){
            this.deck.set(i, new_deck.get(i));
        }*/
    }

    public void dealFour() {
    	System.out.print("inside deal four function");
        // remove the top card from the deck and add it to a column; repeat for each of the four columns
        int elements = deck.size();
        if(elements >= 4){
            for(int i = 0; i < 4; i++){
                cols.get(i).add(deck.get(0));
                deck.remove(0);
            }
        }else{
            System.out.print("out of cards");
        }
    }

    public void remove(int columnNumber) {
        // remove the top card from the indicated column
    	int length = this.cols.get(columnNumber).size();
    	if(length > 0)
    		this.cols.get(columnNumber).remove(length - 1);
    }

    private boolean columnHasCards(int columnNumber) {
    	if(cols.get(columnNumber).isEmpty()) {
    		return false;
    	}
        // check indicated column for number of cards; if no cards return false, otherwise return true
        return true;
    }

    private Card getTopCard(int columnNumber) {
        return this.cols.get(columnNumber).get(this.cols.get(columnNumber).size()-1);
    }


    public void move(int columnFrom, int columnTo) {
//    	Card new_card = getTopCard(columnFrom);
//    	remove(columnFrom);
//    	cols.get(columnFrom).add(new_card);
    	
        // remove the top card from the columnFrom column, add it to the columnTo column
    	Card topcard = getTopCard(columnFrom);
    	removeCardFromCol(columnFrom);
    	addCardToCol(columnTo,topcard);
    }

    private void addCardToCol(int columnTo, Card cardToMove) {
        cols.get(columnTo).add(cardToMove);
    }

    private void removeCardFromCol(int colFrom) {
        this.cols.get(colFrom).remove(this.cols.get(colFrom).size()-1);
    }
}
