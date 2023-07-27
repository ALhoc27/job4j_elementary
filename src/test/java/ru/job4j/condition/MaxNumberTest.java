package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.linesOf;
import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {
    int left;
    int right;

    @Test
    void whenMax1To2Then2() {
        left = 5; right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1AndMax2Then() {
        left = 7; right = 7;
        int result = Max.numEqual(left, right);
        assertThat(left).isEqualTo(result);
    }
}