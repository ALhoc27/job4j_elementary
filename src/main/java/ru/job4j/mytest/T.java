package ru.job4j.mytest;

public class T {
    void start() {
        System.out.println(" - Метод супер класса 'T'");
    }
}

class O extends T {
    void start() {
        System.out.println(" - Переопределенный метод класса наследника 'O'");
    }
}

class MainExample {
    public static void main(String[] args) {
        T ot = new T();
        O ob = new O();

        T r;  /*Переменная ссылка типа супер класс*/
        r = ob;  /*Она может ссылаться на подкласс(обьект подкласса)*/
        r.start();
        r = ot;  /*в том числе на свой обьект(экземпляр своего же класса)*/
        r.start();
    }
}