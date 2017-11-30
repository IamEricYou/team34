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
    //initialized tells if the deck has been built, 0 == no
    public int initialized;
    public int out_of_cards = 0;

    public Game() {
        p = new Player();
        initialized = 0;
    }

    public void createDeck(int type){
        if(type == 1){
            d = new Deck(1);
        }else{
            d = new Deck();
        }
        initialized = 1;
    }

    public void dealFour() {
        System.out.print("inside deal four function");
        // remove the top card from the deck and add it to a column; repeat for each of the four columns
        int elements = d.deck.size();
        if (elements >= 4) {
            for (int i = 0; i < 4; i++) {
                p.cols.get(i).add(d.deck.get(0));
                d.deck.remove(0);
            }
        } else {
            out_of_cards = 1;
            //System.out.print("out of cards");
        }
    }
}