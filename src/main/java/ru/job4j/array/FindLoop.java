package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int result = 0;

        for (int i = 0; i <= data.length - 1; i++) {
            if (data[i] == el) {
                result = i;
                break;
            } else {
                result = -1;
            }
        }
        if (result == -1) {
            System.out.println("Элемент не найден! ");
        }
        return result;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
               result = i;
               break;
            } else {
                result = -1;
            }
        }
        if (result == -1) {
            System.out.println("Элемент не найден!");
        }
        return result;
    }

    public static int indexOfSixOne(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
