package ru.job4j.calculator;

import java.text.DecimalFormat;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);

        plus(1, 2);
        plus(10, 11);

        minus(1, 2);
        minus(10, 11);
    }
}
