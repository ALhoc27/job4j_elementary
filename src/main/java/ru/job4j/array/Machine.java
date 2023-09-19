package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int size = 0;
        int[] tempresul = new int[100];
        int tempChange = money - price;
        for (int coin : coins) {
            while (tempChange >= coin) {
                tempresul[size++] = coin;
                tempChange -= coin;
            }
        }
        return Arrays.copyOf(tempresul, size);
    }
}
