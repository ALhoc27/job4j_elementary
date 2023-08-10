package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int[] temtArray = new int[]{};
        int i = 0;
        int j = array.length - 1;
        while (j > i) {
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            } else if (array[i] > target - array[j]) {
                j--;
            } else {
                i++;
            }
        }
        return new int[0];
    }
}