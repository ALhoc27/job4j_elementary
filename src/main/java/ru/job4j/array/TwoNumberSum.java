package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int[] temtArray = new int[]{};
        int i = 0;
        int j = i + 1;
        while (i <= array.length - 2) {
            if (j != array.length) {
                if (array[i] + array[j] == target) {
                    temtArray = new int[]{i, j};
                    break;
                }
                j++;
            } else {
                j = i + 1;
                i++;
            }
        }
        return temtArray;
    }
}