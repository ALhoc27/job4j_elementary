package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Sdot2quare2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        System.out.println("whenP6K2Sdot2quareDot2 " + expected + " / " + out);
    }

    @Test
    void whenP9K3Sdot2quare379() {
        float expected = 3.79f;
        int p = 9;
        double k = 3;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        System.out.println("whenP8K4Sdot2quareDot379 " + expected + " / " + out);
    }

    @Test
    void whenP8K4Sdot2quare256() {
        float expected = 2.56f;
        int p = 8;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        System.out.println("whenP8K4Sdot2quareDot256 " + expected + " / " + out);
    }

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        int k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }
}