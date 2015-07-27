package com.money;

public class Bank {

    public Money reduce(Expression expression, String to) {
        return expression.reduce(to);
    }

    public void addRate(String from, String to, int i) {

    }
}
