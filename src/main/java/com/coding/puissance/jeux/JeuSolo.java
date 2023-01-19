package com.coding.puissance.jeux;

import com.coding.puissance.module.*;

import java.util.Scanner;

import static com.coding.puissance.module.Players.player1Sym;
import static com.coding.puissance.module.Players.nom1;
import static com.coding.puissance.module.Players.player2Sym;
public class JeuSolo {



    public void JeuSolo() {

        Players players = new Players();
        players.playerSolo();

        Scanner scanner = new Scanner(System.in);
        Grid grid = new Grid();

        WriteTop writeTop = new WriteTop();

        String[][] tableau = grid.table();


        int gagnant = 0;
        int currentPlayer = 1;

        int joueur1 = 0;
        int joueur2 = 0;


        while(gagnant == 0) {
            grid.printBoard(tableau);

            //demande au joueur quel colonne il veut mettre son token
            if (currentPlayer == 1) {
                System.out.print("Joueur " + nom1 + ", choisissez une colonne (1-7) : ");
                int column = scanner.nextInt()-1;
                joueur1++;

                //test si le joueur a mit un chiffre qui n'est pas entre 1 et 7
                if (column < 0 || column > 6 || tableau[0][column] == player1Sym || tableau[0][column] == player1Sym) {
                    System.out.println("Colonne non valide, veuillez réessayer.");
                    continue;
                }

                //faire tomber le token
                Grid.dropPiece(tableau, column, player1Sym);

                //verification des possibilités de gagner ou d'égalité
                if (Verification.checkEgalite(tableau)){
                    System.out.println("EGALITE");
                    gagnant = 1;
                }
                if(Verification.checkWinRowCol(tableau, player1Sym)) {
                    grid.printBoard(tableau);
                    System.out.println("BRAVO "+ nom1);
                    writeTop.writetop(joueur1, nom1);
                    gagnant = 1;
                } else if (Verification.checkDiagonalWin(tableau, player1Sym)) {
                    grid.printBoard(tableau);
                    System.out.println("BRAVO "+ nom1);
                    writeTop.writetop(joueur1, nom1);
                    gagnant = 1;
                }

                currentPlayer = 2;



                //demande au joueur quel colonne il veut mettre son token
            } else if (currentPlayer == 2) {
                System.out.println("Bot, choisissez une colonne (1-7) : ");
                int column = AI.botLv1();
                System.out.println(column + 1);
                joueur2++;

                //test si le joueur a mit un chiffre qui n'est pas entre 1 et 7
                if (column < 0 || column > 6 || tableau[0][column] == player2Sym || tableau[0][column] == player2Sym) {
                    System.out.println("Colonne non valide, veuillez réessayer.");
                    continue;
                }

                //faire tomber le token
                Grid.dropPiece(tableau, column, player2Sym);

                //verification des possibilités de gagner ou d'égalité
                if (Verification.checkEgalite(tableau)){
                    System.out.println("EGALITE");
                    gagnant = 1;
                }
                if (Verification.checkWinRowCol(tableau, player2Sym)) {
                    grid.printBoard(tableau);
                    System.out.println("BRAVO Bot");
                    gagnant = 2;
                } else if (Verification.checkDiagonalWin(tableau, player2Sym)) {
                    grid.printBoard(tableau);
                    System.out.println("BRAVO Bot");
                    gagnant = 2;
                }

                currentPlayer = 1;
            }
        }
    }
}