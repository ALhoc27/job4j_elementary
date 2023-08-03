package ru.job4j.array;

public class Turn {
//    public static int[] back(int[] array) {
//        int[] temp = new int[array.length];
//        for (int i = 0; i <= array.length - 1; i++) {
//            temp[temp.length - 1 - i] = array[i];
//        }
//        return temp;
//    }

    public static int[] back(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i <= array.length / 2; i++) {
            temp[temp.length - 1 - i] = array[i];
            temp[i] = array[array.length - 1 - i];
        }
        return temp;
    }
}
