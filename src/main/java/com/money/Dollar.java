package com.money;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;

    }

    public Dollar times(int i) {
        this.amount = amount * i;
        return null;
    }
}
