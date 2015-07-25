package com.money;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public Money times(int i) {
        return new Franc(this.amount * i);
    }

    @Override
    String currency() {
        return currency;
    }

}
