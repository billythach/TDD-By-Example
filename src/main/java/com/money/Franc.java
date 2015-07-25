package com.money;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int i) {
        return Money.franc(this.amount * i);
    }

}
