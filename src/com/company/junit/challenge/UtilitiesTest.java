package com.company.junit.challenge;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class UtilitiesTest {

    private Utilities utility;

    @org.junit.Before
    public void setup() {
        utility = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        String input = "hello";

        assertArrayEquals("el".toCharArray(),utility.everyNthChar(input.toCharArray(),2));
        assertArrayEquals("aabb".toCharArray(), utility.everyNthChar("aabb".toCharArray(), 10));

    }

    @org.junit.Test
    public void removePairs() {
        String input = "AABCDDEFF";
        String result = utility.removePairs(input);
        String expected = "ABCDEF";
        assertEquals(expected, result);

        String input2 = "ABCCABDEEF";
        String result2 = utility.removePairs(input2);
        String expected2 = "ABCABDEF";
        assertEquals(expected2, result2);

    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, utility.converter(10, 5));
    }

    @org.junit.Test (expected = ArithmeticException.class)
    public void converter_alt() {
        assertEquals(300, utility.converter(10, 0));
    }

    @org.junit.Test
    public void nullIfOddLength() {
        String even = "even";
        String odd = "veryodd";

        assertNotNull(even, utility.nullIfOddLength(even));
        assertNull(null, utility.nullIfOddLength(odd));
    }
}
