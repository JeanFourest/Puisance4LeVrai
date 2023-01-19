package com.coding.puissance.module;

import java.util.Scanner;

import static java.awt.SystemColor.menu;


public class Players {
    public static String player1Sym = "";
    public static String nom1 = "";
    public static String player2Sym = "";
    public static String nom2 = "";


    //creation des joueurs
    public void player(){

        //demande nom au joueur 1
        boolean createPlayerName1 = true;
        while(createPlayerName1) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Votre nom Joueur 1:");

            if (sc.hasNext()) {
                nom1 = sc.next();
                createPlayerName1 = false;
            }
        }


        //demande nom au joueur 2
        boolean createPlayerName2 = true;
        while(createPlayerName2) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Votre nom Joueur 2:");

            if (sc.hasNext()) {
                nom2 = sc.next();
                createPlayerName2 = false;
            }
        }


        //assigne un symbole aux joueurs
        boolean createPlayerSym = true;
        while(createPlayerSym) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quelle symbol voulez vous être "+ nom1 +" ?");
            System.out.println("Tapez 1 pour être le @");
            System.out.println("Tapez 2 pour être =");

            if (sc.hasNextInt()) {

                int reponse = sc.nextInt();

                if (reponse == 1) {
                    System.out.println("Vous êtes le joueur @");
                    player1Sym = "@";
                    player2Sym = "=";
                    createPlayerSym = false;

                } else if (reponse == 2) {
                    System.out.println("Vous êtes le joueur =");
                    player1Sym = "=";
                    player2Sym = "@";
                    createPlayerSym = false;

                } else {
                    System.out.println("c'est invalide veuillez taper un chiffre valable...");
                }
            }
        }


    }

    public void playerSolo(){

        //demande nom au joueur 1
        boolean createPlayerName1 = true;
        while(createPlayerName1) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Votre nom Joueur: ");

            if (sc.hasNext()) {
                nom1 = sc.next();
                createPlayerName1 = false;
            }
        }

        //assigne un symbole aux joueurs et Bot
        boolean createPlayerSym = true;
        while(createPlayerSym) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quelle symbol voulez vous être "+ nom1 +" ?");
            System.out.println("Tapez 1 pour être le @");
            System.out.println("Tapez 2 pour être =");

            if (sc.hasNextInt()) {

                int reponse = sc.nextInt();

                if (reponse == 1) {
                    System.out.println("Vous êtes le joueur @");
                    player1Sym = "@";
                    player2Sym = "=";
                    createPlayerSym = false;

                } else if (reponse == 2) {
                    System.out.println("Vous êtes le joueur =");
                    player1Sym = "=";
                    player2Sym = "@";
                    createPlayerSym = false;

                } else {
                    System.out.println("c'est invalide veuillez taper un chiffre valable...");
                }
            }
        }


    }
}