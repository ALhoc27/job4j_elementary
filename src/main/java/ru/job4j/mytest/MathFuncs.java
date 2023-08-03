package ru.job4j.mytest;

public class MathFuncs {
    public static int func(int x) {
        int y = x * x + 1;
        System.out.println(y);
        return y;
    }

    public static int func1(int x) {
        int y = 1 / x;
        System.out.println(y);
        return y;
    }

    public static void main(String[] args) {
        int rez1 = MathFuncs.func(3);
        int rez2 = MathFuncs.func1(2);

        int total = rez1 + rez2;
        System.out.println(total);

        int result3 = MathFuncs.func1(100);
        System.out.println(result3);

        char c = 45000;
        float i = c;
        System.out.println(i);

    }

    public static int[] compress(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        array[i] = array[j];
                        array[j] = 0;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static int[] compress2Point(int[] array) {
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] == 0 && array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
            j++;
        }
        return array;
    }
}
