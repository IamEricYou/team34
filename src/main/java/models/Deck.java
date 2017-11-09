package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    public java.util.List<Card> deck = new ArrayList<>();

    public Deck(){
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
}
