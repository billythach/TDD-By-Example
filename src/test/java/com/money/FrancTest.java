package com.money;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class FrancTest {

    public void testFrancMultiplication() {
        Franc five= new Franc(5);
        assertThat(new Franc(10)).isEqualTo(five.times(2));
        assertThat(new Franc(15)).isEqualTo(five.times(3));
    }

}
