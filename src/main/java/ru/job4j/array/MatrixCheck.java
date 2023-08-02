package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        int tempNumber = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
            return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        int tempresult = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][column] == 'X') {
                    result = true;
                    ++tempresult;
                    break;
                } else {
                    result = false;
                }
            }
        }
        return  tempresult == board.length;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            if ((monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            } else {
                result = false;
                count++;
            }
        }
        return result;
    }
}
