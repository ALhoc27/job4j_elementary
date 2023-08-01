package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoHorizontal1() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 3;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoHorizontalfalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 3;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }
}