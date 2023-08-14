package ru.job4j.mytest;

public class BubbleSort {

    public static void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            System.out.print("\n i= " + i + "  j= ");
            for (int j = 0; j < sortArr.length - 1 - i; j++) {
                System.out.print(sortArr[j] + " ");
                if (sortArr[j] > sortArr[j + 1]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void bubbleSort1(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            System.out.print("\n i= " + i + "  j= ");
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + " ");
            }
        }
    }
    public static void bubbleSort2(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            System.out.print("\n i= " + i + "  j= ");
            for (int j = i; j < sortArr.length - 1; j++) {
                System.out.print(j + " ");
            }
        }
    }

    public static void bubbleSort3(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            System.out.print("\n i= " + i + "  j= ");
            for (int j = sortArr.length - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }
        }
    }

    public static void bubbleSort4(int[] sortArr) {
        int n = sortArr.length - 1;
        int count = 0;
         for (int i = 0; i < n; i++) {
             if (sortArr[n] > sortArr[i]) {
                 int temp = sortArr[count];
                 sortArr[count] = sortArr[i];

             }
         }
    }

            public static void main(String[] args) {
            int[] sortArr = {12, 6, 4, 1, 15, 10, 0, 4};
            String msgArray = "";
            for (int i: sortArr) {
                msgArray = msgArray + " " + i;
            }

                System.out.print("\n in array " + msgArray + "  bubbleSort");
            bubbleSort(sortArr);
                System.out.print("\n out array: ");
                for (int i : sortArr) {
                    System.out.print(i + " ");
                }
                System.out.println("\n");

                System.out.print("\n in array " + msgArray + "  bubbleSort1");
            bubbleSort1(sortArr);
                System.out.println("\n");

                System.out.print("\n in array " + msgArray + "  bubbleSort2");
            bubbleSort2(sortArr);
                System.out.println("\n");

                System.out.print("\n in array " + msgArray + "  bubbleSort3");
            bubbleSort3(sortArr);
                System.out.println("\n");
    }
}
