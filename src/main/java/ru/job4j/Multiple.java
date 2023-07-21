package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        int one = 1;
        int result;
        for (int i = 1; i < 9; i++) {
            result = i * one;
            System.out.println(one + " * "  + i + " = " + result);
        }
        System.out.println("1 * 9 = 9");
    }
}
