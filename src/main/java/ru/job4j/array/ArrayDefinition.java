package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] priced = new float[40];

        ArrayDefinition array = new ArrayDefinition();
        array.numberElements(priced);
        array.numberElements(surnames);
        array.numberElements(ages);
    }

   public void numberElements(short[] index) {
       System.out.println(index.getClass().getComponentType() + "[] " + index.length);
    }

    public void numberElements(String[] index) {
        System.out.println(index.getClass().getComponentType() + "[] " + index.length);
    }

    public void numberElements(float[] index) {
        System.out.println(index.getClass().getComponentType() + "[] " + index.length);
    }
}
