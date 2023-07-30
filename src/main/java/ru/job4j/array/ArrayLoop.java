package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int name = 5;
        int[] arrayIn = new int[name];
        for (int i = 0; i < name; i++) {
            arrayIn[i] = (i * 2) + 3;
        }

        for (int i = 0; i < name; i++) {
            System.out.println(arrayIn[i]);
        }
        System.out.println("");
        for (int names: arrayIn) {
            System.out.println(names);
        }
    }
}
