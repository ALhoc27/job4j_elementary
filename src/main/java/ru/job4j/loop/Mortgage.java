package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        var tempAmount = amount;
        percent = percent / 100;

        while (tempAmount > 0) {
            tempAmount = (tempAmount + (tempAmount * percent)) - salary;
            year++;
        }
        return year;
    }
}
