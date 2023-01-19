package com.coding.puissance.jeux;

import com.coding.puissance.module.Grid;
import com.coding.puissance.module.Players;
import com.coding.puissance.module.Verification;
import com.coding.puissance.module.WriteTop;

import java.util.Arrays;
import java.util.Scanner;

import static com.coding.puissance.module.Players.player1Sym;
import static com.coding.puissance.module.Players.nom1;
import static com.coding.puissance.module.Players.player2Sym;
import static com.coding.puissance.module.Players.nom2;

public class JeuPour2 {



    public void jeuPour2() {

        Players players = new Players();
        players.player();

        Scanner scanner = new Scanner(System.in);
        Grid grid = new Grid();

        WriteTop writeTop = new WriteTop();

        String[][] tableau = grid.table();

        //tableau[0][0] = 3;

        int gagnant = 0;
        int currentPlayer = 1;

        int joueur1 = 0;
        int joueur2 = 0;


        while(gagnant == 0) {
            grid.printBoard(tableau);

            if (currentPlayer == 1) {
                System.out.print("Joueur " + nom1 + ", choisissez une colonne (1-7) : ");
                int column = scanner.nextInt()-1;
                joueur1++;

                if (column < 0 || column > 6 || tableau[0][column] == player1Sym || tableau[0][column] == player1Sym) {
                    System.out.println("Colonne non valide, veuillez réessayer.");
                    continue;
                }
                currentPlayer = 2;

                Grid.dropPiece(tableau, column, player1Sym);
                if (Verification.checkEgalite(tableau)){
                    System.out.println("EGALITE FDP");
                    gagnant = 1;
                }
                if(Verification.checkWinRowCol(tableau, player1Sym)) {
                    grid.printBoard(tableau);
                    System.out.println("BRAVO FDP");
                    writeTop.writetop(joueur1, nom1);
                    gagnant = 1;
                } else if (Verification.checkDiagonalWin(tableau, player1Sym)) {
                    grid.printBoard(tableau);
                    System.out.println("BRAVO FDP");
                    writeTop.writetop(joueur1, nom1);
                    gagnant = 1;
                }



            } else if (currentPlayer == 2) {
                System.out.print("Joueur " + nom2 + ", choisissez une colonne (1-7) : ");
                int column = scanner.nextInt() - 1;
                joueur2++;

                if (column < 0 || column > 6 || tableau[0][column] == player2Sym || tableau[0][column] == player2Sym) {
                    System.out.println("Colonne non valide, veuillez réessayer.");
                    continue;
                }
                currentPlayer = 1;

                Grid.dropPiece(tableau, column, player2Sym);
                if (Verification.checkEgalite(tableau)){
                    System.out.println("EGALITE FDP");
                    gagnant = 1;
                }
                if (Verification.checkWinRowCol(tableau, player2Sym)) {
                    grid.printBoard(tableau);
                    System.out.println("BRAVO FDP");
                    writeTop.writetop(joueur2, nom2);
                    gagnant = 2;
                } else if (Verification.checkDiagonalWin(tableau, player2Sym)) {
                    grid.printBoard(tableau);
                    System.out.println("BRAVO FDP");
                    writeTop.writetop(joueur2, nom2);
                    gagnant = 2;
                }
            }
        }
    }
}