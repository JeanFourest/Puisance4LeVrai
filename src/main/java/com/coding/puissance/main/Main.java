package com.coding.puissance.main;
import com.coding.puissance.jeu2.JeuPour2;
import com.coding.puissance.module.Grid;
import com.coding.puissance.module.Players;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean loop = true;

        while(loop) {
            Scanner sc = new Scanner(System.in);

            System.out.println("que voulez-vous faire ?");
            System.out.println("tapez 1 si vous voulez jouer seul");
            System.out.println("tapez 2 si vous voulez jouer a 2");
            System.out.println("tapez 3 si vous voulez voir le score");
            System.out.println("tapez 4 si vous voulez quitter");


            if (sc.hasNextInt()) {

                int reponse = sc.nextInt();

                if (reponse == 1) {
                    System.out.println("jouer seul");

                } else if (reponse == 2) {
                    System.out.println("jouer a 2");
                    JeuPour2 jeuPour2 = new JeuPour2();
                    jeuPour2.jeuPour2();

                } else if (reponse == 3) {
                    System.out.println("voir score");

                } else if (reponse == 4) {
                    System.out.println("quitter :)");
                    loop = false;

                } else {
                    System.out.println("c'est invalide veuillez taper un chiffre valable...");

                }

            }

        }

    }
}