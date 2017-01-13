/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Rajtek
 */
public class Phrases {

    private static List<String> phrases=new ArrayList<>();
    private static Random generator = new Random();
    public Phrases(String file) {
        FileReader fr = null;
        String linia = "";

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.err.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(fr);
        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        try {
            while ((linia = bfr.readLine()) != null) {
                phrases.add(linia);
            }
        } catch (IOException e) {
            System.err.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

        // ZAMYKANIE PLIKU
        try {
            fr.close();
            
        } catch (IOException e) {
            System.err.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }
    }
    
    
    public static String getPhrase(){
        int index = generator.nextInt(phrases.size());
        return phrases.get(index);
    }
}

