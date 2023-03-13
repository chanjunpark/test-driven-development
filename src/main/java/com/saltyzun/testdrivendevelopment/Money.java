package com.saltyzun.testdrivendevelopment;

public abstract class Money {
    protected int amount;
    protected String currency;

    public boolean equals(final Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    abstract Money times(final int multiplier);

    String currency() {
        return currency;
    };

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(final int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franc(final int amount) {
        return new Franc(amount, "CHF");
    }
    
}
