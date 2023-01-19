package com.coding.puissance.module;


import java.util.ArrayList;
import java.util.List;

public class Verification {

    public static boolean checkEgalite(String[][] board) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                list.add(board[j][i]);

                if (list.size() == 42 && list.contains("X") && list.contains("O") && !list.contains(".")) {
                    return true;
                }
            }

        }

        return false;
    }

    public static boolean checkWinRowCol(String[][] board, String player) {
        // Vérification des lignes
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j].equals(player) && board[i][j + 1].equals(player) && board[i][j + 2].equals(player) && board[i][j + 3].equals(player)) {
                    return true;
                }
            }
        }

        // Vérification des colonnes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (board[i][j].equals(player) && board[i + 1][j].equals(player) && board[i + 2][j].equals(player) && board[i + 3][j].equals(player)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDiagonalWin(String[][] board, String player) {
        int rows = board.length;
        int cols = board[0].length;


        // en haut a gauche -> en bas a droite
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                player = board[i][j];
                if(!player.equals(".")){
                    int count = 0;
                    for (int x = i, y = j; x < rows && y < cols; x++, y++) {
                        if (board[x][y].equals(player)) {
                            count++;
                            if (count >= 4) {
                                return true;
                            }
                        } else {
                            count = 0;
                        }
                    }
                }
            }
        }

        // Check top-right to bottom-left diagonals: en haut a droite -> en bas a gauche
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                player = board[i][j];
                if(!player.equals(".")){
                    int count = 0;
                    for (int x = i, y = j; x < rows && y >= 0; x++, y--) {
                        if (board[x][y].equals(player)) {
                            count++;
                            if (count >= 4) {
                                return true;
                            }
                        } else {
                            count = 0;
                        }
                    }
                }
            }
        }
        return false;
    }
}
