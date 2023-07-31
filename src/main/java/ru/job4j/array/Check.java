package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        int countTempBoolean = 0;
        for (boolean i: data) {
            if (i) {
                countTempBoolean++;
            } else {
                countTempBoolean--;
            }
        }
        return Math.abs(countTempBoolean) == data.length;
    }
}
