package ru.job4j.mytest;

class Ab {
    Ab() {
        System.out.println("Конструктор Аb (Супер класс)");
    } /* конструктор Ab*/
}

class Ac extends Ab {
    Ac() {
        System.out.println("Конструктор Аc (Наследует от супер класса)");
    } /* конструктор Ac*/
}

class Ad extends Ac {
    Ad() {
        System.out.println("Конструктор Аd (Наследует от класса, который унаследовал от супер класса)");
    } /* конструктор Ad*/
}

public class ExampleA {
    public static void main(String[] args) {
        Ad d = new Ad(); /* обьект класса Ad*/
    }
}