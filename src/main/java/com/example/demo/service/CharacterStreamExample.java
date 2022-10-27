package com.example.demo.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

    public void copyFile(String src, String dest) throws IOException {

        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader(src);
            writer = new FileWriter(dest);

            // reads a byte at a time, if it reached end of the file, returns -1
            int content;
            int compteur = 0;
            while ((content = reader.read()) != -1) {
                compteur++;
                writer.append((char) content);
                System.out.println((char) content);
                System.out.println("Compteur: " + compteur);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
