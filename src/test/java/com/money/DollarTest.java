package com.money;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class DollarTest {

    public void testMultiplication() {
        Dollar five= new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product).isEqualTo(new Dollar(10));
        product = five.times(3);
        assertThat(product).isEqualTo(new Dollar(15));
    }

    public void testEquality() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(6)).isNotEqualTo(new Dollar(5));
    }

}
