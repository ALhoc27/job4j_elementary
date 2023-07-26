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
        System.out.println("whenP6K2Sdot2quare2 " + expected + " / " + out);
    }

    @Test
    void whenP9K3Sdot2quare379() {
        float expected = 3.79f;
        int p = 9;
        double k = 3;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        System.out.println("whenP8K4Sdot2quare379 " + expected + " / " + out);
    }

    @Test
    void whenP8K4Sdot2quare256() {
        float expected = 2.56f;
        int p = 8;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        System.out.println("whenP8K4Sdot2quare256 " + expected + " / " + out);
    }
}