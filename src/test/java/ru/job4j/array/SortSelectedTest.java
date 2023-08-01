package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 0, 1, 2, 5, 2, 1, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 1, 2, 2, 3, 5, 8};
        assertThat(result).containsExactly(expected);
    }
}