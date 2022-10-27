package com.example.demo.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public void copyFile(String src, String dest) throws IOException {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(src);
            outputStream = new FileOutputStream(dest);

            // reads a byte at a time, if it reached end of the file, returns -1
            int content;
            int compteur = 0;
            while ((content = inputStream.read()) != -1) {
                compteur++;
                outputStream.write((byte) content);
                System.out.println((byte) content);
                System.out.println("Compteur: " + compteur);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
