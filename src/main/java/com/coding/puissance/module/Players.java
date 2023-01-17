package com.coding.puissance.module;

import java.util.Scanner;


public class Players {

    static String player1 = "";

    public static String envoie(){
        return player1;
    }

    public void player(){

        boolean createPlayer = true;

        while (createPlayer) {


            Scanner sc = new Scanner(System.in);

            System.out.println("Quelle symbol voulez vous être ?");
            System.out.println("Tapez 1 pour être le X");
            System.out.println("Tapez 2 pour être O");

            if (sc.hasNextInt()) {

                int reponse = sc.nextInt();

                if (reponse == 1) {
                    System.out.println("Vous êtes le joueur X");
                    player1 = "X";


                } else if (reponse == 2) {
                    System.out.println("Vous êtes le joueur O");
                    player1 = "O";


                } else {
                    System.out.println("c'est invalide veuillez taper un chiffre valable...");
                }
            }
        }
    }

}
