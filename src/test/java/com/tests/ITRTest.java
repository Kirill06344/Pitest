package com.tests;

import com.classes.IntegerToRoman;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ITRTest {


    private IntegerToRoman cnvr = new IntegerToRoman();


    @Test
    public void outOfRange() {
        String message = "The function correctly work with numbers beetween 1 and 3999";
        assertEquals(message, cnvr.intToRoman(0));
        assertEquals(message, cnvr.intToRoman(4000));
        assertEquals(message, cnvr.intToRoman(-1));
    }

    @Test
    public void fromOneToTen() {
        assertEquals("I", cnvr.intToRoman(1));
        assertEquals("II", cnvr.intToRoman(2));
        assertEquals("III", cnvr.intToRoman(3));
        assertEquals("IV", cnvr.intToRoman(4));
        assertEquals("V", cnvr.intToRoman(5));
        assertEquals("VI", cnvr.intToRoman(6));
        assertEquals("VII", cnvr.intToRoman(7));
        assertEquals("VIII", cnvr.intToRoman(8));
        assertEquals("IX", cnvr.intToRoman(9));
        assertEquals("X", cnvr.intToRoman(10));
    }

    @Test
    public void underHundred() {
        assertEquals("LXXVIII", cnvr.intToRoman(78));
        assertEquals("L", cnvr.intToRoman(50));
        assertEquals("XCIX", cnvr.intToRoman(99));
    }

    @Test
    public void otherAThousand() {
        assertEquals("MCMXCIV", cnvr.intToRoman(1994));
        assertEquals("MMXXXIV", cnvr.intToRoman(2034));
        assertEquals("MMMCMXCIX", cnvr.intToRoman(3999));
    }

}

