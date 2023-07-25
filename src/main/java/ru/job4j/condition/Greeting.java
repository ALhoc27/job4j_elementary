package ru.job4j.condition;

import java.time.YearMonth;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String year = Integer.toString(YearMonth.now().getYear());
        idea += year;
        System.out.println(idea);
    }
}
