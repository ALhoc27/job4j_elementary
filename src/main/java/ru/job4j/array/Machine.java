package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int tempChange = money - price;
        int tempSize = 0;
        int[] tempresul = new int[100];
        for (int i : coins) {
            while (tempChange >= i) {
                tempresul[tempSize++] = i;
                tempChange -= i;
            }
        }
        return Arrays.copyOf(tempresul, tempSize);
    }
}
