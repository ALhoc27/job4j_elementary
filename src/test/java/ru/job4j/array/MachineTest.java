package ru.job4j.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MachineTest {

    @Test
    public void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] result = Machine.change(money, price);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price21() {
        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void collectionTest() {
        List result = List.of(10, 5, 2, 1);
        List expected = List.of(10, 5, 2, 1);
        assertIterableEquals(result, expected, "1234");
    }

    @Test
    public void arrayTest() {
        int[] result = {10, 5, 2, 1};
        int[] expected = {10, 5, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void arrayTest2() {
        int[] result = {10, 5, 2, 1};
        int[] expected = {10, 5, 2, 1};
        assertArrayEquals(result, expected, "msg");
    }

    @Test
    void equalsTest() {
        int actual = (int) 133.78d;
        int expected = 133;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void acccertNullTest() {
        Object actual = null;
        assertThat(actual).isNull();
    }

    @Test
    void acccerNotNullTest() {
        Object actual = 123;
        assertNotNull((int) actual);
    }

}
