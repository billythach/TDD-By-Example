package com.money;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class MoneyTest {

    public void testEquality() {
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(6)).isNotEqualTo(Money.dollar(5));
        assertThat(Money.franc(5)).isEqualTo(Money.franc(5));
        assertThat(Money.franc(6)).isNotEqualTo(Money.franc(5));
        assertThat(Money.franc(5)).isNotEqualTo(Money.dollar(5));
    }

    public void testCurrency() {
        assertThat(Money.dollar(1).currency()).isEqualTo("USD");
        assertThat(Money.franc(1).currency()).isEqualTo("CHF");
    }
}