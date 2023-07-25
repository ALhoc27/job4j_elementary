package ru.job4j.converter;

public class Converter {
    static float courseofdolarRub = 60f;
    static float courseofEuroRub = 70f;

    public static float rubleToEuro(float value) {
        float rsl = courseofEuroRub * value;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = courseofdolarRub * value;
        return rsl;
    }

    public static float eurotoRuble(float value) {
        float rsl = value / courseofEuroRub;
        return rsl;
    }

    public  static float dollartoRuble(float value) {
        float rsl = value / courseofdolarRub;
        return rsl;
    }

    public static void main(String[] args) {
        float value = 140f;
        System.out.println("Курс долара: " + courseofdolarRub + " rub");
        System.out.println("Курс евро: " + courseofEuroRub + " rub");
        System.out.println("");
        float euro = Converter.rubleToEuro(value);
        String sf1 = String.format("%,.2f", euro);
        System.out.println(value + " euro are " + sf1 + " rub.");
        float dollar = rubleToDollar(value);
        String sf2 = String.format("%,.2f", dollar);
        System.out.println(value + " dollar are " + sf2 + " rub.");
        //___
        float eurotoR = eurotoRuble(value);
        String sf3 = String.format("%,.2f", eurotoR);
        System.out.println(value + " rubles are " + sf3 + " euro.");
        float dollartoR = dollartoRuble(value);
        String sf4 = String.format("%,.2f", dollartoR);
        System.out.println(value + " rubles are " + sf4 + " dollar.");
    }
}
