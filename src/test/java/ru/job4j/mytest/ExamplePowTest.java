package ru.job4j.mytest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExamplePowTest {

    @Test
    void getIndexes() {
        int[] input = {-2, 0, 1, 4, 7};
        int[] expected = {-4, 0, 1, 16, 49};
        int[] result = ExamplePow.getIndexesSort(input);
        assertThat(result).isEqualTo(expected);
    }
}