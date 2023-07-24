package ru.job4j.calculator;

import java.text.DecimalFormat;

public class Calculator {
    static int one;
    static int two;

    public static void main(String[] args) {
        one = 1;
        two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int size = 10;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        //Пример
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo + " / " + sixDivTwo + " / " + fiveMinusTwo + " / " + fourTimeTwo);
        one = 10;
        two = 11;
        System.out.printf("new one: %s, new two: %s", one, two);
        size = size - 5;
        System.out.println(size);
        // Отступ
        plus(123, 2131);
    }

    static void plus(int a, int b) {
        DecimalFormat dF = new DecimalFormat("#,###");
        one = a; two = b;
        int result = one + two;
        System.out.println(dF.format(result));
    }
}
