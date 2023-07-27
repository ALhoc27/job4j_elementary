package ru.job4j.condition;

import java.util.Random;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
        }

    public static int numEqual(int left, int right) {
        int equalNumber = 0;
        if (left == right) {
            equalNumber = left;
            return equalNumber;
        }
        return equalNumber;
    }
}
