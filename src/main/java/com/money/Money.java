package com.money;

public class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    String currency() {
        return currency;
    }

    Money times(int i) {
        return new Money(this.amount * i, this.currency);
    }

    public Money plus(Money money) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && currency.equals(money.currency);
    }

}
