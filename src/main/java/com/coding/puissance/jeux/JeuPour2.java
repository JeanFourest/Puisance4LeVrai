package com.coding.puissance.jeux;

import com.coding.puissance.module.Grid;
import com.coding.puissance.module.Players;

import java.util.Arrays;
import java.util.Scanner;

import static com.coding.puissance.module.Players.player1;
import static com.coding.puissance.module.Players.player2;

public class JeuPour2 {



    public void jeuPour2() {

        Players players = new Players();
        players.player();

        Scanner scanner = new Scanner(System.in);
        Grid grid = new Grid();

        String[][] tableau = grid.table();

        //tableau[0][0] = 3;

        int gagnant = 0;
        int currentPlayer = 1;



        while(gagnant == 0) {
            grid.printBoard(tableau);

            if (currentPlayer == 1) {
                System.out.print("Joueur " + currentPlayer + ", choisissez une colonne (1-7) : ");
                int column = scanner.nextInt()-1;

                if (column < 0 || column > 6) {
                    System.out.println("Colonne non valide, veuillez réessayer.");
                    continue;
                }

                tableau[5][column] = player1;


                currentPlayer = 2;

            } else if (currentPlayer == 2) {
                System.out.print("Joueur " + currentPlayer + ", choisissez une colonne (1-7) : ");
                int column = scanner.nextInt()-1;

                if (column < 0 || column > 6) {
                    System.out.println("Colonne non valide, veuillez réessayer.");
                    continue;
                }

                tableau[5][column] = player2;

                currentPlayer = 1;

                //vérification que la ligne est un entier entre 1 et 7:


            }

        }
    }
}
