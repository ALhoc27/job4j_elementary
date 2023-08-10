package ru.job4j.loop;

public class Slash {

    public static void draw(int size) {
        System.out.println("Draw by " + size);
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                if (row + cell == size - 1) {
                    System.out.print("X");
                } else if (row == cell) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        draw(7);
        draw(9);
    }
}