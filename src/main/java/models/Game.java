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
        d = new Deck();
        p = new Player();
    }

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
