package ru.job4j.array;

public class AlgoArray {
    /*public static void main(String[] args) {
        int[] array = new int[] {3, 5, 2, 1, 4};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
     */

        public static void main(String[] args) {
            int[] array = new int[] {5, 3, 2, 1, 4};
            int temp = array[0];
            array[0] = array[3];
            array[3] = temp;
            temp = array[3];
            array[3] = array[4];
            array[4] = temp;
            temp = array[1];
            array[1] = array[2];
            array[2] = temp;

            for (int index = 0; index < array.length; index++) {
                System.out.println(array[index]);
            }
        }
    }
