package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class testCard {
    @Test
    public void testGetSuit(){
        Card c = new Card(5,Suit.Club);
        assertEquals(Suit.Club,c.getSuit());
    }

    @Test
    public void testToString(){
        Card c = new Card(5,Suit.Club);
        assertEquals("5Club",c.toString());
    }


    }