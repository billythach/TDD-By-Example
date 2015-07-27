package com.money;

public class Sum implements Expression {
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = this.augend.amount + this.addend.amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression expression) {
        return null;
    }
}
