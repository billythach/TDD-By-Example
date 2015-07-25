package com.money;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int i) {
        return Money.franc(this.amount * i);
    }

    @Override
    String currency() {
        return currency;
    }

}
