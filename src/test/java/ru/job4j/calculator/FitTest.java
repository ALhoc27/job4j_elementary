package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void wheneHeight187ManWeightThen100() {
        float inHeight = 187;
        float eps = 0.01f;
        float expected = 100.05f;
        float outMen = (float) ((inHeight - 100) * 1.15);
        assertThat(outMen).isEqualTo(expected, withPrecision(eps));
        System.out.println("wheneHeight187ManWeightThen100 " + expected + " / " + outMen);
    }

    @Test
    void wheneHeight187WoomenWeightThen100() {
        float inHeight = 187;
        float eps = 0.01f;
        float expected = 88.55f;
        float outWomen = (float) ((inHeight - 110) * 1.15);
        assertThat(outWomen).isEqualTo(expected, withPrecision(eps));
        System.out.println("wheneHeight187WoomenWeightThen100 " + expected + " / " + outWomen);
    }
}