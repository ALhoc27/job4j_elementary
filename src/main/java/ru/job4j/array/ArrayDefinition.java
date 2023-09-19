package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] priced = new float[40];
        String[] names = new String[4];

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(priced.length);
        System.out.println(names.length);

        names[0] = "Petr Arsentev";
        names[1] = "Gav";
        names[2] = "Naf-naf";
        names[3] = "Red";
        System.out.println("names: " + Arrays.stream(names).toList());

    }
}