package com.money;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;

    }

    public void times(int i) {
        this.amount = amount * i;
    }
}
