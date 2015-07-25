package com.money;

public class Dollar extends Money {

    private String currency;

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    public Money times(int i) {
        return new Dollar(this.amount * i);
    }

    @Override
    String currency() {
        return currency;
    }

}
