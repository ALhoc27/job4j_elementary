package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {
    private static final float Course_Of_Dolar_Rub = 60f;
    private static final float Course_Of_Euro_Ru = 70f;

    public static float eurotoRuble(float value) {
        float rsl = Course_Of_Euro_Ru * value;
        return rsl;
    }

    public static float dollartoRuble(float value) {
        float rsl = Course_Of_Dolar_Rub * value;
        return rsl;
    }

    public static float rubleToEuro(float value) {
        float rsl = value / Course_Of_Euro_Ru;
        return rsl;
    }

    public  static float rubleToDollar(float value) {
        float rsl = value / Course_Of_Dolar_Rub;
        return rsl;
    }

    public static void main(String[] args) {
        float value = 140f;

        float in = value;
        float expectedeurotoER = 9800;
        float outER = Converter.eurotoRuble(in);
        boolean passedsf = expectedeurotoER == outER;
        float expectedeurotoDR = 8400;
        float outDR = Converter.dollartoRuble(in);
        boolean passedsfq = expectedeurotoDR == outDR;
        float expectedeurotoRE = 2;
        float outRE = Converter.rubleToEuro(in);
        boolean passedsfw = expectedeurotoRE == outRE;
        float expectedeurotoRD = 2.3333333f;
        float outRD = Converter.rubleToDollar(in);
        boolean passedsfe = expectedeurotoRD == outRD;

        System.out.println("Курс долара: " + Course_Of_Dolar_Rub + " rub");
        System.out.println("Курс евро: " + Course_Of_Euro_Ru + " rub");
        System.out.println("");

        float eurotoR = eurotoRuble(value);
        String sfEurotoR = String.format("%,.2f", eurotoR);
        System.out.println(value + " euro are " + sfEurotoR + " rub.");
        float dollartoR = dollartoRuble(value);
        String sfDollartoR = String.format("%,.2f", dollartoR);
        System.out.println(value + " dollar are " + sfDollartoR + " rub.");
        float rubtoEuro = Converter.rubleToEuro(value);
        String sfRubtoEuro = String.format("%,.2f", rubtoEuro);
        System.out.println(value + " rubles are " + sfRubtoEuro + " euro.");
        float rubtodDollar = rubleToDollar(value);
        String sfRubtodDollar = String.format("%,.2f", rubtodDollar);
        System.out.println(value + " rubles are " + sfRubtodDollar + " dollar.");

        System.out.println("\nTest: ");
        System.out.println(value + " euro are " + expectedeurotoER + "   Test result : " + passedsf);
        System.out.println(value + " dollar are " + expectedeurotoDR + "   Test result : " + passedsfq);
        System.out.println(value + " rubles are " + expectedeurotoRE + "   Test result : " + passedsfw);
        System.out.println(value + " rubles are " + expectedeurotoRD + "   Test result : " + passedsfe);
    }
}
