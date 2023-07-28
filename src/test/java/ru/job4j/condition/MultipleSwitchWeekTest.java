package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class MultipleSwitchWeekTest {

    @Test
    void numberOfDay() {
        String nameIn = "Вторник";
        int expected = 2;
        int result = MultipleSwitchWeek.numberOfDay(nameIn);
        assertThat(result).isEqualTo(expected);
    }
}