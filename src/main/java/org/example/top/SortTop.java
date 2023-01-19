package org.example.top;

import java.util.List;

public class SortTop{

    //création d'une fonction tri_insertion pour trier les scores
    public static List tri_insertion(List score) {

        //boucle qui parcours les données
        for (int i = 1; i <score.size(); i++) {

            //récupère l'élément d'une position spécifiée dans la liste
            int ligne = (int) score.get(i);
            int j = i-1;

            //modifie un élément pour le mettre dans l'ordre
            while (j >= 0 && (int)score.get(j) > ligne) {
                score.set(j+1, score.get(j));
                j = j - 1;
            }
            //
            score.set(j+1, ligne);
        }
        //retourne la liste dans l'ordre
        return score;
    }

}