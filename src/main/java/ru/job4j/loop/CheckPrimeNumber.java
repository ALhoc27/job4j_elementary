package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int count = 0;
        boolean status = false;
        status = number != 1 ? status : status;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if ((count <= 2) && (count >= 2)) {
            status = true;
            return true;
        } else if (status) {
            return status;
        }
        return status;
    }
}
