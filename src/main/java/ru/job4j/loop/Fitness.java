package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 1;
        int ratioIvan = 3;
        int ratioNikolay = 2;
        if (ivan > nik) {
           return --month;
        }
        while ((ivan * ratioIvan * month) < (nik * ratioNikolay)) {
            month++;
        }
        return month;
    }
}
