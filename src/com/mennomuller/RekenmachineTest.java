package com.mennomuller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RekenmachineTest {

    @Test
    void eenPlusEenIsTwee() {
        Rekenmachine r = new Rekenmachine();
        assertEquals(2,r.optellen(1,1));
    }

    @Test
    void minEenPlusVierIsDrie(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(3,r.optellen(-1,4));
    }

    @Test
    void drieMinTweeIsEen(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(1,r.aftrekken(3,2));
    }

    @Test
    void vierMinZevenIsMinDrie(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(-3,r.aftrekken(4,7));
    }

    @Test
    void minMinIsPlus(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(2,r.aftrekken(1,-1));
    }

    @Test
    void zesKeerZevenIsTweeenveertig(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(42,r.vermenigvuldigen(6,7));
    }

    @Test
    void minKeerMinIsPlus(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(12,r.vermenigvuldigen(-3,-4));
    }

    @Test
    void minKeerPlusIsMin(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(-15,r.vermenigvuldigen(3,-5));
    }

    @Test
    void ietsKeerNulIsNul(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(0, r.vermenigvuldigen(123,0));
    }

    @Test
    void delenDoorNulIsFlauwekul(){
        Rekenmachine r = new Rekenmachine();
        assertThrows(ArithmeticException.class,() -> r.delen(11,0));
    }

    @Test
    void twaalfGedeeldDoorDrieIsVier(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(4,r.delen(12,3));
    }

    @Test
    void afgerondDelen(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(10,r.delen(99,10));
    }

    @Test
    void tweeTotDeDerdeIsAcht(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(8,r.machtsverheffen(2,3));
    }

    @Test
    void totDeMachtNul(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(1,r.machtsverheffen(16,0));
    }

    @Test
    void totDeMachtMinTwee(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(0,r.machtsverheffen(45,-2));
    }

    @Test
    void totDeMachtMinEen(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(1,r.machtsverheffen(2,-1));
    }

    @Test
    void wortelVanZestien(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(4,r.worteltrekken(16,2));
    }

    @Test
    void derdeMachtsWortel(){
        Rekenmachine r = new Rekenmachine();
        assertEquals(2,r.worteltrekken(8,3));
    }

    @Test
    void geenComplexeGetallen(){
        Rekenmachine r = new Rekenmachine();
        assertThrows(ArithmeticException.class,() -> r.worteltrekken(-1,2));
    }
}
