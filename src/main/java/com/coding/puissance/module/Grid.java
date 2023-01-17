package com.coding.puissance.module;

import java.util.Scanner;

public class Grid {
    static int matrix[][];
    public void table() {


        // crée une matrice
        matrix= new int[6][7];
        //initialise chaque élément de la matrice à 0

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = 0;

            }

        }

    }

    public static void printBoard() {
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

}
