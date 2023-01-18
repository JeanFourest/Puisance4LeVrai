package com.coding.puissance.module;

public class Grid {
    static String matrix[][];
    public static String[][] table() {


        // crée une matrice
        matrix= new String[6][7];
        //initialise chaque élément de la matrice à 0

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = ".";

            }


        }

        return matrix;
    }

    public static void printBoard(String[][] matrix) {
        System.out.println("  1   2   3   4   5   6   7");
        System.out.println("-----------------------------");

        //initialise chaque élément de la matrice à 0
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
    }
    public static void dropPiece(String[][] matrix, int colonne, String player){
        int line = 5;

        while (!matrix[line][colonne].equals(".")) {
            line--;
        }
        matrix[line][colonne] = player;
    }

    public static void dropPiece(String[][] matrix, int colonne, String player){
        int line = 5;

        while (!matrix[line][colonne].equals(".")) {
            line--;
        }
        matrix[line][colonne] = player;
    }

}
