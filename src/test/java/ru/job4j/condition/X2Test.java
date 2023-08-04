package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class X2Test {

    @Test
    void whenA10B0C0X2DotThen40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;

        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X1DotThen3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;

        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenA0B1C1X1DotThen2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;

        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenA1B1C0X1DotThen2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;

        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
        System.out.println(expected + " / " + rsl);
    }

    @Test
    void whenA1B1C1X0DotThen1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;

        int expected = 1;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
        System.out.println(expected + " / " + rsl);
    }
}