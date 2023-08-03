package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus58() {
        int[] data = new int[] {5, 10, 3, 1, 6, 36, 336, 1, 0, 9, 43};
        int el = 3;
        int start = 8;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus5() {
        int[] data = new int[] {5, 10, 3, 1, 6, 3};
        int el = 3;
        int start = 4;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}