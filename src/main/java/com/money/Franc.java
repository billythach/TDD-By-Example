package com.money;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int i) {
        return new Money(this.amount * i, this.currency);
    }

}
