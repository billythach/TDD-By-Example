package com.money;

public class Bank {

    public Money reduce(Expression expression, String to) {
        if(expression instanceof Money) {
            return (Money) expression;
        }
        Sum sum = (Sum) expression;
        return sum.reduce(to);
    }

}
