package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] tempresul = new int[1];
        int change = money - price;
        if (change == 0) {
            tempresul = new int[]{};
            return tempresul;
        }
        int tempCount = 1;

        for (int i = 0; i < coins.length; i++) {
            while (change >= coins[i]) {
                change = change - coins[i];
                tempresul[tempCount - 1] = coins[i];
               if (change == 0) {
                   return tempresul;
               }
                ++tempCount;
                tempresul = Arrays.copyOf(tempresul, tempCount);
            }
        }
        return tempresul;
    }
}
