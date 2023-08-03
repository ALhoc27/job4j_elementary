package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {

        int min;
        int tempMinIndex;
        int i = 0;
        do {
            min = MinDiapason.findMin(data, i, data.length - 1);
            tempMinIndex = FindLoop.indexInRange(data, min, i, data.length - 1);
            data = SwitchArray.swap(data, tempMinIndex, i);
            i++;
        }
        while (i < data.length - 1);
        return data;
    }
}