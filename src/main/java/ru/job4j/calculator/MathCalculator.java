package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDivandDif(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumFourOperation(double first, double second) {
        return sumAndMultiply(first, second) + sumDivandDif(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета (умножения и сложения) равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета (вычитания и деления) равен: " + sumDivandDif(10, 20));
        System.out.println("Результат расчета равен: " + sumFourOperation(10, 20));
    }
}
