package com.money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;

    }

    public Dollar times(int i) {
        return new Dollar(this.amount * i);
    }

}
