package ru.job4j.condition;

public class ChessBoard {

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static int elephantFigure(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1) && isValid(y2) && isValid(x2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            }
        }
        return rsl;
    }

    public static int wayElephant(int x1, int x2) {
        return Math.abs(x2 - x1);
    }

    public static int figureRook(int x1, int y1, int x2, int y2) {
        int[] srgsWay = {x1, y1, x2, y2}; int rsl = 0;
        boolean nextOper = true;
        for (int i:srgsWay) {
            if (i >= 0 && i <= 7) {
                System.out.print("");
            } else {
                nextOper = false;
            }
        }

        if ((nextOper) && (x1 == x2 || y1 == y2)) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static int wayRook(int x1, int x2, int y1, int y2) {
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }
}
