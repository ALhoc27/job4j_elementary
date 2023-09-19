package ru.job4j;

public class SimpleStringEncoder {

    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result = new StringBuilder((counter == 1 ? result.toString() + symbol : result.toString() + symbol + counter));
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return (counter == 1 ? result.toString() + symbol : result.toString() + symbol + counter);
    }
}
