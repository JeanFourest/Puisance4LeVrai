package org.example.top;

import java.io.FileWriter;
import java.io.IOException;

public class Top {

    public void top(){

        try {
            FileWriter fw = new FileWriter("TOP.txt");
            fw.write({} + "a un record de : " + {});
            fw.close();
            System.out.println("Record sauvegardé avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
