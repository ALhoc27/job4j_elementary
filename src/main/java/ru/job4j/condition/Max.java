package ru.job4j.condition;

import java.util.Random;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
        }

    public static int max(int left, int right, int thirdNumber) {
        return max(max(left, right), thirdNumber);
        /*return (left > right && left > thirdNumber) ? left : (right > thirdNumber) ? right : thirdNumber;*/
    }

    public static int max(int left, int right, int thirdNumber, int fourthNumber) {
        return max(max(max(left, right), thirdNumber), fourthNumber);
        /*return (max(left, right, thirdNumber) > fourthNumber) ? max(left, right, thirdNumber) : fourthNumber;*/
    }

    public static void main(String[] args) {
        System.out.println(max(12, 2, 32, 1));
        System.out.println(max(0, 11, 10));
        System.out.println(max(99, 99));
    }
}
