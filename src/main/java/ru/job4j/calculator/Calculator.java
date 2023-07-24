package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
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
    }
}
