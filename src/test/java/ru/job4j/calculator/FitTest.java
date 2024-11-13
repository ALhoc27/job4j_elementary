package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void wheneHeight187ManWeightThen100Dot05() {
        short in = 187;
        double eps = 0.01f;
        double expected = 100.05f;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void wheneHeight187WoomenWeightThen88Dot55f() {
        short in = 187;
        double eps = 0.01f;
        double expected = 88.55f;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    } // 112
}