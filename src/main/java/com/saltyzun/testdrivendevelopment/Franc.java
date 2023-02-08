package com.saltyzun.testdrivendevelopment;

public class Franc extends Money{
    
    public Franc(int amount) {
        this.amount = amount;
    }
    
    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    
    
    public boolean equals(final Object obj) {
        Franc franc = (Franc) obj;
        return amount == franc.amount;
    }
}
