package com.money;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;

    }

    public Dollar times(int i) {
        return new Dollar(this.amount * i);
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

}
