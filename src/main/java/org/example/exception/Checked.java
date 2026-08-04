package org.example.exception;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* Checked exception resolved ar compile time\
* mandatory to handle.
* */
public class Checked {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("afiedt.buf.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

