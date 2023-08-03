package ru.job4j.array;

import java.util.Arrays;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int[] temtArray = new int[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    temtArray = new int[]{i, j};
                    break;
                }
            }
        }
        return temtArray;
    }
}