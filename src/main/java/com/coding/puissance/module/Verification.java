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
            for (int j = 0; j < 6; j++) {
                if (board[i][j] == player && board[i + 1][j] == player && board[i + 2][j] == player && board[i + 3][j] == player) {
                    return true;
                }
            }
        }
        return false;
    }

        public static boolean checkDiagonalWin(String[][] board, String player) {
            // Check diagonal (bottom-right to top-left)
            int count = 0;
            for (int i = 0, j = 0; i < board.length && j < board[i].length; i++, j++) {
                if (board[i][j] == player) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }

            // Check diagonal (top-left to bottom-right)
            count = 0;
            for (int i = 5, j = 6; i >= 0 && i < board.length && j >= 0 && j < board[0].length; i--, j--) {
                if (board[i][j] == player) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                }
            }
            // Check diagonal (top-right to bottom-left)
            count = 0;
            for (int i = 5, j = 0; i >= 0 && j < board[i].length; i--, j++) {
                if (board[i][j] == player) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
            // Check diagonal (bottom-left to top-right)
            count = 0;
            for (int i = 0, j = 6; i < board.length && j >= 0; i++, j--) {
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
