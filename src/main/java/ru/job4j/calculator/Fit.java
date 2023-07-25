package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        if (rsl < 100) {
            double rezrsl = 100 - rsl;
            System.out.printf("До идеального веса, вам не хватает: %,.2f \n", rezrsl);
            return rsl;
        } else {
            System.out.println("У вас идеальный вес!");
            return rsl;
        }
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        if (rsl < 100) {
            double rezrsl = 100 - rsl;
            System.out.printf("До идеального веса, вам не хватает: %,.2f \n", rezrsl);
            return rsl;
        } else {
            System.out.println("У вас идеальный вес!");
            return rsl;
        }
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + man + "\n");
        double woman = Fit.womanWeight(height);
        System.out.println("Woman " + height + " is " + woman + "\n");
    }
}
