package utilities;

import java.util.*;
import java.io.*;

public class Input {
    public static void input(ArrayList<String> list) {

        System.out.println("Press 1. for words\"");
        System.out.println("Press any Number for \"words1\"");
        Scanner sc = new Scanner(System.in);

        try {
            String n;
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    n = "./src/main/resources/words.txt";
                    break;
                default:
                    n = "./src/main/resources/words1.txt";
            }

            /*
             * Reads a file containing alphabetically sorted words list (one word per line,
             * no spaces, all lower case) Scanning words from text
             */
            File myObj = new File(n);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                /** Extracting word from text file */
                String data = myReader.nextLine();
                /** Adding words into arraylist */
                list.add(data);

            }

            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        sc.close();

    }
}
