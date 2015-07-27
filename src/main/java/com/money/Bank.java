package com.money;

public class Bank {

    public Money reduce(Expression expression, String to) {
        Sum sum = (Sum) expression;
        int amount = sum.addend.amount + sum.augend.amount;
        return new Money(amount, to);
    }

}
