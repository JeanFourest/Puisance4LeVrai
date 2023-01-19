package com.coding.puissance.module;

import java.util.Scanner;

import static java.awt.SystemColor.menu;


public class Players {
    public static String player1Sym = "";
    public static String nom1 = "";
    public static String player2Sym = "";
    public static String nom2 = "";

    public void player(){

        boolean createPlayerName1 = true;
        while(createPlayerName1) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Votre nom Joueur 1:");

            if (sc.hasNext()) {
                nom1 = sc.next();
                createPlayerName1 = false;
            }
        }

        boolean createPlayerName2 = true;
        while(createPlayerName2) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Votre nom Joueur 2:");

            if (sc.hasNext()) {
                nom2 = sc.next();
                createPlayerName2 = false;
            }
        }

        boolean createPlayerSym = true;
        while(createPlayerSym) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Quelle symbol voulez vous être "+ nom1 +" ?");
            System.out.println("Tapez 1 pour être le X");
            System.out.println("Tapez 2 pour être O");

            if (sc.hasNextInt()) {

                int reponse = sc.nextInt();

                if (reponse == 1) {
                    System.out.println("Vous êtes le joueur X");
                    player1Sym = "X";
                    player2Sym = "O";
                    createPlayerSym = false;

                } else if (reponse == 2) {
                    System.out.println("Vous êtes le joueur O");
                    player1Sym = "O";
                    player2Sym = "X";
                    createPlayerSym = false;

                } else {
                    System.out.println("c'est invalide veuillez taper un chiffre valable...");
                }
            }
        }


    }
}