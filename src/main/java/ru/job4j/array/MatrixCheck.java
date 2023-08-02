package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i <= board.length; i++) {
            if (board[row] == board[i]) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 'X') {
                        result = true;
                        return result;
                    } else {
                        result = false;
                        break;
                    }
                }
                result = false;
                break;
            } else {
                if (board.length == board[i].length) {
                    for (int j = 0; j < board[i].length; j++) {
                        if (board[i][j] != ' ') {
                            System.out.println("Не верный массив");
                            result = false;
                            break;
                        }
                    }
                } else {
                    System.out.println("Не верный массив");
                    result = false;
                    break;
                }
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

}
