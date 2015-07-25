package com.money;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int i) {
        return Money.dollar(this.amount * i);
    }

    @Override
    String currency() {
        return currency;
    }

}
