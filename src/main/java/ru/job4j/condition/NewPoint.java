package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class NewPoint {
    private int x;

    private int y;

    public NewPoint(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(NewPoint that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        NewPoint a = new NewPoint(0, 0);
        NewPoint b = new NewPoint(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }

}
