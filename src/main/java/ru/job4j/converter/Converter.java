package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {
    static float courseofdolarRub = 60f;
    static float courseofEuroRub = 70f;

    public static float eurotoRuble(float value) {
        float rsl = courseofEuroRub * value;
        return rsl;
    }

    public static float dollartoRuble(float value) {
        float rsl = courseofdolarRub * value;
        return rsl;
    }

    public static float rubleToEuro(float value) {
        float rsl = value / courseofEuroRub;
        return rsl;
    }

    public  static float rubleToDollar(float value) {
        float rsl = value / courseofdolarRub;
        return rsl;
    }

    public static void main(String[] args) {
        float value = 140f;
        //tests
        float in = value;
        float expectedeurotoR1 = 9800;
        float out1 = Converter.eurotoRuble(in);
        boolean passedsf1 = expectedeurotoR1 == out1;
        float expectedeurotoR2 = 8400;
        float out2 = Converter.dollartoRuble(in);
        boolean passedsf2 = expectedeurotoR2 == out2;
        float expectedeurotoR3 = 2;
        float out3 = Converter.rubleToEuro(in);
        boolean passedsf3 = expectedeurotoR3 == out3;
        float expectedeurotoR4 = 2.3333333f;
        float out4 = Converter.rubleToDollar(in);
        boolean passedsf4 = expectedeurotoR4 == out4;

        System.out.println("Курс долара: " + courseofdolarRub + " rub");
        System.out.println("Курс евро: " + courseofEuroRub + " rub");
        System.out.println("");

        float eurotoR = eurotoRuble(value);
        String sf1 = String.format("%,.2f", eurotoR);
        System.out.println(value + " euro are " + sf1 + " rub.");
        float dollartoR = dollartoRuble(value);
        String sf2 = String.format("%,.2f", dollartoR);
        System.out.println(value + " dollar are " + sf2 + " rub.");
        float rubtoEuro = Converter.rubleToEuro(value);
        String sf3 = String.format("%,.2f", rubtoEuro);
        System.out.println(value + " rubles are " + sf3 + " euro.");
        float rubtodDollar = rubleToDollar(value);
        String sf4 = String.format("%,.2f", rubtodDollar);
        System.out.println(value + " rubles are " + sf4 + " dollar.");
        //view test
        System.out.println("\nTest: ");
        System.out.println(value + " euro are " + expectedeurotoR1 + "   Test result : " + passedsf1);
        System.out.println(value + " dollar are " + expectedeurotoR2 + "   Test result : " + passedsf2);
        System.out.println(value + " rubles are " + expectedeurotoR3 + "   Test result : " + passedsf3);
        System.out.println(value + " rubles are " + expectedeurotoR4 + "   Test result : " + passedsf4);
    }
}
