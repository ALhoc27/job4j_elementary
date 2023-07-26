package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void wheneHeight187ManWeightThen100() {
        short inHeight = 187;
        double eps = 0.01f;
        double expected = 100.05f;
        double outMen = Fit.manWeight(inHeight);
        assertThat(outMen).isEqualTo(expected, withPrecision(eps));
        System.out.println("wheneHeight187ManWeightThen100 " + expected + " / " + outMen);
    }

    @Test
    void wheneHeight187WoomenWeightThen100() {
        short inHeight = 187;
        double eps = 0.01f;
        double expected = 88.55f;
        double outWomen = Fit.womanWeight(inHeight);
        assertThat(outWomen).isEqualTo(expected, withPrecision(eps));
        System.out.println("wheneHeight187WoomenWeightThen100 " + expected + " / " + outWomen);
    }
}