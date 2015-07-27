package com.money;

public class Bank {

    public Money reduce(Expression expression, String to) {
        return expression.reduce(to);
    }

}
