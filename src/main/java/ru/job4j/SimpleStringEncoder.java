package ru.job4j;

public class SimpleStringEncoder {
    static int counter = 0;

    public static String encode(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                result.append(currentChar);
                if (count > 1) {
                    result.append(count);
                }
                currentChar = nextChar;
                count = 1;
            }
        }

        result.append(currentChar);
        if (count > 1) {
            result.append(count);
        }

        return result.toString();
    }
}
