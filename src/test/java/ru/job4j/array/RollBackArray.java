package ru.job4j.array;

public class RollBackArray {

    public static int[] rollback(int[] array) {
        int[] newArray = new int[array.length];
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            newArray[index] = array[array.length - index - 1];
        }
        return newArray;
    }
}
