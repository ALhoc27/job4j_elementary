package ru.job4j.mytest;

public abstract class ExampleAbstract {
    double t = 212;

    abstract void msgTerminal();
}

class Mainstart extends ExampleAbstract {

    @Override
    void msgTerminal() {
        t = 213;
        System.out.println("Необходимо реализовать метод, иначе будет ошибка " + t);
    }

}

class MainM {
    public static void main(String[] args) {
        Mainstart obM = new Mainstart();

        obM.msgTerminal();
    }
}