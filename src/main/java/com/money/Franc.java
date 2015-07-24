package com.money;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;

    }

    public Franc times(int i) {
        return new Franc(this.amount * i);
    }

}
