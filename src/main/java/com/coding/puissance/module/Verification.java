package com.coding.puissance.module;

public class Verification {

    public static boolean checkWinRowCol(String[][] board, String player) {
        // Vérification des lignes
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == player && board[i][j + 1] == player && board[i][j + 2] == player && board[i][j + 3] == player) {
                    return true;
                }
            }
        }

        // Vérification des colonnes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == player && board[i + 1][j] == player && board[i + 2][j] == player && board[i + 3][j] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkDiagonalWin(String[][] board, int row, int col, String  player) {
        int count = 0;
        // vérifier la diagonale vers le haut à gauche
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == player) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        count = 0;

        // vérifier la diagonale vers le bas à droite

        for (int i = row, j = col; i < board.length && j < board[0].length; i++, j++) {
            if (board[i][j] == player) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

}
