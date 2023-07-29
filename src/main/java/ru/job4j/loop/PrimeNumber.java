package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number = 0; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
        System.out.println("");
        return count;
    }
}
