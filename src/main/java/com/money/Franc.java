package com.money;

public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;

    }

    public Franc times(int i) {
        return new Franc(this.amount * i);
    }

    @Override
    public boolean equals(Object o) {
        Franc franc = (Franc) o;
        return amount == franc.amount;
    }

}
