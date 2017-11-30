package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    public java.util.List<Card> deck = new ArrayList<>();

    public Deck() {
    	for(int i = 2; i < 15; i++){
    		deck.add(new Card(i,Suit.Club));
    		deck.add(new Card(i,Suit.Heart));
    		deck.add(new Card(i,Suit.Diamond));
    		deck.add(new Card(i,Suit.Spade));
    	}	 	
    }
    
    //1 = Spanish deck
    public Deck(int deck_type){
    	if(deck_type == 1) {
    		for(int i = 1; i < 10; i++) {
    			deck.add(new Card(i,Suit.Espadas));
    			deck.add(new Card(i,Suit.Oros));
    			deck.add(new Card(i,Suit.Bastos));
    			deck.add(new Card(i,Suit.Copas));
    		}
    		deck.add(new Card(0,Suit.Joker));
    		deck.add(new Card(0,Suit.Joker));
    	}
    }
    
    public void shuffle() {
        Collections.shuffle(deck);
    }
}
