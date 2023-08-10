package ru.job4j.mytest;

public class Ex {
    int x;
    int y;

    Ex(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Ey extends Ex {
    int z;

    Ey(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class MainResult {
    public static void main(String[] args) {
        Ey ey = new Ey(12, 23, 45); /*Создали обькт унаследовов часть полей от супер класса*/
        /* с помощью конструкции super()*/
    }
}