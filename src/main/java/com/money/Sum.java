package com.money;

public class Sum implements Expression {
    public Expression augend;
    public Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = this.augend.reduce(bank, to).amount + this.addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression expression) {
        return new Sum(this, expression);
    }

    @Override
    public Expression times(int mutiplier) {
        return null;
    }
}
