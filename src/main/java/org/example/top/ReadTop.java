package org.example.top;

import java.io.*;
import java.util.Scanner;

public class ReadTop {

    public void readtop(){



        try {

            File file = new File("TOP.txt");

            String line ;

            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            Scanner scanner = new Scanner(br);


            while (scanner.hasNext())  //returns a boolean value
            {
                line = scanner.nextLine();
                System.out.println( line );
            }

            scanner.close();


        }

         catch (IOException e) {
             System.out.println("erreur");
        }

    }

}
