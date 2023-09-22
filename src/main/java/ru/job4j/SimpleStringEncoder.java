package ru.job4j;

public class SimpleStringEncoder {
    static int counter = 0;

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        for (int i = 0; i <= input.length() - 1; i++) {
            if (symbol == input.charAt(i)) {
                result = (symbol == input.charAt(i)) ? "counter++" : result + symbol;
                counter++;
                System.out.print(" (до иф)counter = " + counter);
            } else {
                result = (counter > 1) ? result + symbol + counter : result + symbol;
                System.out.println(" (после иф)counter = " + counter + " ");
                System.out.print(" result = " + result + " ");
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        return result;
    }
}
