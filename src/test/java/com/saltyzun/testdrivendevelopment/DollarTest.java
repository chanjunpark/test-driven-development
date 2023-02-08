package com.saltyzun.testdrivendevelopment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {
    
    @Test
    void testDollarMultiplication() {
        Dollar five = new Dollar(5);
        
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    
    @Test
    void testFrancMultiplication() {
        Franc five = new Franc(5);
        
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
    
    @Test
    void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(6).equals(new Dollar(5)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(6).equals(new Franc(5)));
    }

}