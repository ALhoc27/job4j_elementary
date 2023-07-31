package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap4to7() {
        int[] input = {1, 2, 4, 3, 4, 7, 8};
        int source = 2;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 7, 3, 4, 4, 8};
        assertThat(result).containsExactly(expected);
    }

}