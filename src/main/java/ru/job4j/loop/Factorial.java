package ru.job4j.loop;

import java.sql.SQLOutput;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        } else if (n == 0) {
            result = 1;
            return result;
        } else {
            System.out.println("Ошибка отрицаательное значение");
            return 0;
        }
    }
}
