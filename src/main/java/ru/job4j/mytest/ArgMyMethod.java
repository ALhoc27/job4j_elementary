package ru.job4j.mytest;

    public class ArgMyMethod {
        static String nameMy = "";
        String str;

        ArgMyMethod() {
            System.out.println("example");
        }

        ArgMyMethod(String str) {
            this();
            this.str = str;
        }

        public static void hello() {
            System.out.println("Hello, " + nameMy);
        }

        public void helloMy(String nameMy) {
            System.out.println(nameMy + " экземпляр");
        }

        public static void main(String[] args) {
            nameMy = "Petr Arsentev";
            ArgMyMethod.hello();

            ArgMyMethod helloMyConstr = new ArgMyMethod();
            helloMyConstr.helloMy("Sasha");

            int a = 'A';
            int b = 'B';
            System.out.println("A: " + a);
            System.out.println("B: " + b);
            System.out.println("A + B: " + (a + b));
    }
}
