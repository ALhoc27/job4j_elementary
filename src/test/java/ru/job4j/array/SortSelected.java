package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        //3, 4, 1, 2, 5
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