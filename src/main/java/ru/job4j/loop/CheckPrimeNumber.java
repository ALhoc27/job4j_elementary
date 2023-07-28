package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number % 2 != 0 && number != 1) {
            return false;
        } else {
            return true;
        }
    }
}
