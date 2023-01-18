package org.example.top;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTop{

    public void writetop(turn, name){


        try{
            File file = new File("TOP.txt");

            if (file.exists()){

                FileWriter writer = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(writer);

                bw.write(name + " : " + turn + ";");
                bw.newLine();
                bw.close();

            }else{

            }

        }catch(IOException e){
            System.out.println("erreur");
        }


    }
}
