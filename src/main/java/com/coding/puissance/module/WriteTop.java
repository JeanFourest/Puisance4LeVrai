package com.coding.puissance.module;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTop{

    //public void writetop(){
    public void writetop(int turn, String name){

        //String player = "jordan";
        //int score = 16;


        try{
            //créer un fichier TOP.txt si inexistant
            File file = new File("TOP.txt");

            //si le fichier existe alors...
            if (file.exists()){

                //vérifie les commodités pour l'écriture des fichiers caractères
                FileWriter writer = new FileWriter(file, true);

                //Écrit du texte dans un flux de sortie de caractères, en mettant les caractères en mémoire tampon
                // afin de permettre l'écriture efficace de caractères uniques, de tableaux et de chaînes.
                BufferedWriter bw = new BufferedWriter(writer);

                //ecrit le gagnant dans le fichier sous la forme suivante :
                bw.write(name + " : " + turn);
                //créé une nouvelle ligne
                bw.newLine();
                bw.close();

            }else{

            }

        }catch(IOException e){
            System.out.println("erreur");
        }


    }
}