package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean tempBoolean = false;
        int tempCount = 0;
        for (int i = 0; i <= post.length - 1; i++) {
            if (word[word.length - i - 1] == post[post.length - i - 1]) {
                tempCount++;
                tempBoolean = (tempCount == post.length);
            }

        }
        return tempBoolean;
    }
}
