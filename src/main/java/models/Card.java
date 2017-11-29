package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class Card implements Serializable {
    public final int value;
    public final Suit suit;
    public String vis;

    @JsonCreator
    public Card(@JsonProperty("value") int value, @JsonProperty("suit") Suit suit) {
        this.value = value;
        this.suit = suit;
        vis = Integer.toString(value);
        if(value > 10) {
            System.out.println("The value is greater than 10");
        	if(value == 11) {
        		vis = "J";
        	}
        	else if(value == 12) {
        		vis = "Q";
        	}
        	else if(value == 13) {
        		vis = "K";
        	}
        	else if(value == 14) {
        		vis = "A";
        	}
        }
        System.out.println("The displayed value should be");
        System.out.println(this.vis);
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    
    // Jack == 11 Queen == 12 King == 13 Ace = 14
    public String toString() {
        return this.vis + this.suit.toString();
    }
}
