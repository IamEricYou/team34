package models;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class testPlayer {

    @Test
    public void createPlayer (){
        Player p = new Player();
        assertNotNull(p);
    }


}

