package com.company.junit.challenge;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private Utilities utility;
    private String input;
    private String expected;

    @org.junit.Before
    public void setup() {
        utility = new Utilities();
    }

    public UtilitiesTestParameterized(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @org.junit.Test
    public void removePairsParam() {
        assertEquals(expected, utility.removePairs(input));
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][] {
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }
}
