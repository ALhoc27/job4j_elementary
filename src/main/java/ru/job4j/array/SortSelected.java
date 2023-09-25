package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {

        for (int j = 0; j < data.length - 1; j++) {
            int tempEl = MinDiapason.findMin(data, j, data.length - 1);
            int tempMinIndex = FindLoop.indexInRange(data, tempEl, j, data.length - 1);
            SwitchArray.swap(data, tempMinIndex, j);
        }
        return data;
    }
}