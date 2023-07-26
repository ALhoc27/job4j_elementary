package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rslH = p / (2 * (k + 1));
        System.out.println("Высота: " + rslH);
        double rslS = Math.pow(rslH, 2) * k;
        System.out.println("Площадь: " + rslS);
        return rslS;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
