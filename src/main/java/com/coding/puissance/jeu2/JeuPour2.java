package com.coding.puissance.jeu2;

import com.coding.puissance.module.Grid;
import com.coding.puissance.module.Players;

public class JeuPour2 {

    Players joueurActuel;

    public void jeuPour2() {
        Players players = new Players();
        players.player();

        Players players2 = new Players();
        players.player();

        Grid grid = new Grid();
        joueurActuel = players;

        System.out.println(joueurActuel.getSymbole());

        grid.draw();

        if(joueurActuel == players){
            joueurActuel = players2;
        }else{
            joueurActuel = players;
        }

        }

    }
