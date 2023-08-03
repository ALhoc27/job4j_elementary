package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int tempMinIndex;

        for (int j = 0; j < data.length - 1; j++) {
            tempMinIndex = FindLoop.indexInRange(data, MinDiapason.findMin(data, j, data.length - 1), j, data.length - 1);
            data = SwitchArray.swap(data, tempMinIndex, j);
        }
        return data;
    }
}