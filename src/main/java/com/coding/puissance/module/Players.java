package com.coding.puissance.module;

import java.util.Scanner;


public class Players {

    int number;

    public String getSymbole() {
        return symbole;
    }


    String symbole;

    public void player(){

        boolean player = true;

        while (player) {


            Scanner sc = new Scanner(System.in);

            System.out.println("Quelle symbol voulez vous être ?");
            System.out.println("Tapez 1 pour être le X");
            System.out.println("Tapez 2 pour être O");

            if (sc.hasNextInt()) {

                int reponse = sc.nextInt();

                if (reponse == 1) {
                    System.out.println("Vous êtes le joueur X");
                    this.number = 1;
                    this.symbole = "X";

                    player = false;

                } else if (reponse == 2) {
                    System.out.println("Vous êtes le joueur O");
                    this.number = 2;
                    this.symbole = "O";

                    player = false;

                } else {
                    System.out.println("c'est invalide veuillez taper un chiffre valable...");
                }
            }
        }
    }

}
