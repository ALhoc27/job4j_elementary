package ru.job4j.mytest;

public class MyClassExample {
}

class FirstDerivedClass extends MyClassExample {
    int x = 10;
}

class TypeMyExample {
    // Несмотря на то что getObj () возвращает различные типы
    // объектов в иерархии наследования MyClassExample,
    // объявленным типом возвращаемого значения является MyClassExample.
    // В результате во всех трех показанных здесь случаях предполагается,
    // что типом переменных является MyClassExample,
    // хотя получаются разные производные типы объектов.
    public static void main(String[] args) {
        MyClassExample j; /* типом переменнjq j является MyClassExample */
        MyClassExample getObjExample = new MyClassExample(); /* обьект типа MyClassExample */
        FirstDerivedClass getObjFirstDerived = new FirstDerivedClass();

        j = getObjFirstDerived;
        getObjExample = getObjFirstDerived;

//        j.x = 10;
//        getObjExample.x = 10;
    }
}