package ru.job4j.mytest;

public class ExamplePow {

    public static int[] getIndexesSort(int[] array) {
        for (int n = 0; n < array.length; n++) {
            array[n] = (int) (array[n] > 0 ? Math.pow(array[n], 2) : -(Math.pow(array[n], 2)));
        }
        return array;
    }

  /*  public static int[] getIndexes(int[] array) {
        for (int n = 0; n < array.length; n++) {
            array[n]
        }
        return array;
    }*/
}
