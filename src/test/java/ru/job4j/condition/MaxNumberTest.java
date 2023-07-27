package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {

    @Test
    void maxNumTest() {
        int result = Max.max(5, 7);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}