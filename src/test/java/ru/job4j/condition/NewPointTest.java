package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class NewPointTest {

    @Test
    void whenDistanceY1Y2X1X2exp1dot41() {
        double expected = 1.41;
        NewPoint a = new NewPoint(1, 1);
        NewPoint b = new NewPoint(2, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenDistanceY1Y2X1X2exp6dot32() {
        double expected = 6.32;
        NewPoint a = new NewPoint(0, 0);
        NewPoint b = new NewPoint(2, 6);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenDistanceY1Y2X1X2exp2() {
        double expected = 2;
        NewPoint a = new NewPoint(0, 0);
        NewPoint b = new NewPoint(2, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}