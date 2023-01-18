package org.example.top;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTop{

    public void writetop(){
    //public void writetop(turn, name){

        String player = "jordan";
        int score = 16;


        try{
            File file = new File("TOP.txt");

            if (file.exists()){

                FileWriter writer = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(writer);

                bw.write(player + " : " + score + ";");
                bw.newLine();
                bw.close();

            }else{

            }

        }catch(IOException e){
            System.out.println("erreur");
        }


    }
}
