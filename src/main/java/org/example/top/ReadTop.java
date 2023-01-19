package org.example.top;

import java.io.*;
import java.util.*;

public class ReadTop {

    public void readtop(){


        try {

            File file = new File("TOP.txt");

            //lis le fichier file
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            Scanner sc = new Scanner(br);

            //initialisation de hashmap
            //permet de stocker des paires clé/valeur
            HashMap<String, Integer> score = new HashMap<String, Integer>();

            //returns a boolean value
            while (sc.hasNext())
            {
                //scan chaque ligne du doc
                String line = sc.nextLine();
                //initialisation de la séparation entre les variables
                String[] scores = line.split(" : ");
                score.put(scores[0], Integer.valueOf(scores[1]));
            }

            //si la table des scores n'est pas vide
            if(score.size()!=0) {



                List sortedKeys = new ArrayList(score.values());
                //appelle du tri dans SortTop.java
                List sortedGrid = SortTop.tri_insertion(sortedKeys);

                //creation de tableau pour les variables
                List<String> name = new ArrayList<>();
                List<Integer> turn = new ArrayList<>();


                int rank = 0;

                //boucle qui répète l'instruction
                for (Object key : sortedGrid) {

                    //initialisation de la variable player
                    String player = "";

                    //interface statique Map.Entry imbriqué dans interface Map
                    //représente une entrée donc paire clé/valeur
                    //la méthode score.entrySet retourne Map.Entry qui contient les paires clé/valeur
                    for(Map.Entry mapentry : score.entrySet()) {

                        //compare l'objet spécifié et l'entrée pour voir si égalité
                        //renvoie true si objet donné est aussi une entrée de Map
                        //donc les deux entrées représentent la meme Map
                        if (mapentry.getValue().equals(key)) {

                            //vérifie bien si la chaine de caractère est trouvée
                            if (!name.contains(mapentry.getKey().toString())) {

                                //attribue le clé à la variable player
                                player = mapentry.getKey().toString();

                                //donne la chaine de caractère par rapport à la clé correspondante
                                name.add(mapentry.getKey().toString());

                                //donne la valeur du nombre de coups par rapport à la clé correspondante
                                turn.add((int) mapentry.getValue());
                                break;
                            }
                        }
                    }
                    //calcul la position du rang du joueur
                    rank++;
                    //ecrit le classement du joueur
                    System.out.println("#Top" + rank + " " + player + " a gagné en " + key + " coups");

                    //la liste s'arrete au bout des 10 premiers records
                    if (rank == 10) {
                        break;
                    }
                }

            //ecrit si aucuns scores dans la table
            }else {
                System.out.println("Aucun score n'est enregistré.");
            }

        }catch (IOException e) {
             System.out.println("erreur");
        }

    }

}
