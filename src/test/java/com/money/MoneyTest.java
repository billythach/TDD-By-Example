package com.money;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class MoneyTest {

    public void testEquality() {
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(6)).isNotEqualTo(Money.dollar(5));
        assertThat(new Franc(5)).isEqualTo(new Franc(5));
        assertThat(new Franc(6)).isNotEqualTo(new Franc(5));
        assertThat(new Franc(5)).isNotEqualTo(Money.dollar(5));
    }

}