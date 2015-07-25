package com.money;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int i) {
        return new Money(this.amount * i, this.currency);
    }

}
