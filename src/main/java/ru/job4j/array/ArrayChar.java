package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        int countChar = 0;
        for (int i = 0; i <= pref.length - 1; i++) {
            if (word[i] == pref[i]) {
                countChar++;
            }
        }
        return countChar == pref.length;
    }
}
