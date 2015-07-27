package com.money;

public class Bank {

    public Money reduce(Expression expression, String to) {
        Sum sum = (Sum) expression;
        return sum.reduce(to);
    }

}
