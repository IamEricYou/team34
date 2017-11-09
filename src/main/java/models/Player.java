package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Player {

    public java.util.List<java.util.List<Card>> cols = new ArrayList<>(4);

    public Player(){
        //initialize a new player such that each column can store cards
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
    }

    public void remove(int columnNumber) {
        // remove the top card from the indicated column
    	  if(this.cols.get(columnNumber).size() > 0)
    		    removeCardFromCol(columnNumber);
    }

    private boolean columnHasCards(int columnNumber) {
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
}
