package com.money;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int i) {
        return new Dollar(this.amount * i, this.currency);
    }

}
