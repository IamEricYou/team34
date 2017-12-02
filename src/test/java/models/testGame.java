package models;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class testGame {

    @Test
    public void testGameCreation() {
        Game g = new Game();
        assertNotNull(g);
    }

}