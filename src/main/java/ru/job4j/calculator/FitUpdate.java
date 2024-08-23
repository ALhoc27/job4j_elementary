package ru.job4j.calculator;

public class FitUpdate {

    public enum Gender {
        MAN, WOMAN
    }

    public static double calculateWeight(short height, Gender gender) {
        int baseHeight = (gender == Gender.MAN) ? 100 : 110;
        return (height - baseHeight) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;

        double manWeight = FitUpdate.calculateWeight(height, Gender.MAN);
        System.out.printf("Man %d cm has an ideal weight of %.2f kg%n", height, manWeight);

        double womanWeight = FitUpdate.calculateWeight(height, Gender.WOMAN);
        System.out.printf("Woman %d cm has an ideal weight of %.2f kg%n", height, womanWeight);
    }

}
