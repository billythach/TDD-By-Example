package com.money;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class DollarTest {

    public void testMultiplication() {
        Dollar five= new Dollar(5);
        five.times(2);
        assertThat(five.amount).isEqualTo(10);
        assertThat(true).isEqualTo(false);
    }

}
