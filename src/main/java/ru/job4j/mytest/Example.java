package ru.job4j.mytest;

public class Example {
    int i, j;

    Example(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println("i & j: " + i);
    }
}

class B extends Example {
    int k;

    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show(String msg) {
        System.out.println("k: " + k);
        System.out.println(msg);
    }
}

class Main {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 4);
        subOb.show("66666");
        subOb.show();
    }
}
