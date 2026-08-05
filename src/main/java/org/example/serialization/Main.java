package org.example.serialization;

import java.io.FileInputStream;
import java.io.Serializable;


public class Main implements Serializable {

    int id;
    String name;

    public Main(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        Main student = new Main(10,"Harsh");



    }
}
