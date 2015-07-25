package com.money;

public class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    String currency() {
        return currency;
    }

    Money times(int times) {
        return null;
    }


    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
