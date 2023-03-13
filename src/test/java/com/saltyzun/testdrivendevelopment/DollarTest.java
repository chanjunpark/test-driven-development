package com.saltyzun.testdrivendevelopment;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {
    
    @Test
    @Disabled
    void testDollarMultiplication() {
//        Dollar five = new Dollar(5);
//
//        assertEquals(new Dollar(10), five.times(2));
//        assertEquals(new Dollar(15), five.times(3));
    }
    
    @Test
    @Disabled
    void testFrancMultiplication() {
//        Franc five = new Franc(5);
//
//        assertEquals(new Franc(10), five.times(2));
//        assertEquals(new Franc(15), five.times(3));
    }
    
    @Test
    @Disabled
    void testEquality() {
//        assertTrue(new Dollar(5).equals(new Dollar(5)));
//        assertFalse(new Dollar(6).equals(new Dollar(5)));
//        assertTrue(new Franc(5).equals(new Franc(5)));
//        assertFalse(new Franc(6).equals(new Franc(5)));
//        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    @Test
    @Disabled
    void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));

    }

    @Test
    @Disabled
    void testEqualityChapter8() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(6).equals(Money.dollar(5)));
//        assertTrue(new Franc(5).equals(new Franc(5)));
//        assertFalse(new Franc(6).equals(new Franc(5)));
//        assertFalse(new Franc(5).equals(Money.dollar(5)));
    }

    @Test
    void testFrancMultiplicationChapter8() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), (five.times(2)));
        assertEquals(Money.franc(15), (five.times(3)));
    }

    // =============
    //   CHAPTER 9
    // =============

    @Test
    void testCurrencyChapter9() {
        assertEquals("USD", Money.dollar(1).currency);
        assertEquals("CHF", Money.franc(1).currency);

    }

}