package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void wheneHeight187ManWeightThenDot100() {
        short inHeight = 187;
        double eps = 0.01f;
        double expected = 100.05f;
        double outMen = Fit.manWeight(inHeight);
        assertThat(outMen).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void wheneHeight187WoomenWeightThenDot100() {
        short inHeight = 187;
        double eps = 0.01f;
        double expected = 88.55f;
        double outWomen = Fit.womanWeight(inHeight);
        assertThat(outWomen).isEqualTo(expected, withPrecision(eps));
    }
}