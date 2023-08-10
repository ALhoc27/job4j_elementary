package ru.job4j.mytest;

public class Aq {

    void callme() {
        System.out.println("Класс A");
    }
}

class Bq extends Aq {
    @Override
    void callme() {
        System.out.println("Класс B");
    }
}

class Cq extends Aq {
    @Override
    void callme() {
        System.out.println("Класс C");
    }
}

class Dispath {
    public static void main(String[] args) {
        Aq aq; /* переменная типа ссылка на супер класс */
        Bq b = new Bq(); /* классы наследник или под класс, класса Aq */
        Cq c = new Cq(); /* классы наследник или под класс, класса Aq */

        aq = b; /* переменная типа супер класс ссылается на обьект класса наследника Bq переопределяя методы */
        aq.callme(); /* вызовется переопределенный метод подкласса b callme() -> Класс B */
        aq = c; /* переменная типа супер класс ссылается на обьект класса наследника Cq переопределяя методы */
        aq.callme(); /* вызовется переопределенный метод подкласса c callme() -> Класс C */

/*         for (int i = 2; i <= 3; i++) {
            aq = switch (i) {
                 case 2 -> b;  aq = b
                 case 3 -> c;  aq = c
                 default -> null;
            };
            aq.callme(); */

    /* метод который есть в супер классе,
             и он же переопределяется в классах, обьекты которых мы создали
            */
            /* то есть в классе
            Bq есть метод callme() который выводит Класс B
            и в классе Cq есть метод callme() который выводит Класс C
            и в супер классе этот метод есть! по этому он и переорпеделяется

        }*/

    }
}
