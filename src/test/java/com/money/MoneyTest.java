package com.money;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class MoneyTest {

    public void testEquality() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(6)).isNotEqualTo(new Dollar(5));
        assertThat(new Franc(5)).isEqualTo(new Franc(5));
        assertThat(new Franc(6)).isNotEqualTo(new Franc(5));

    }

}