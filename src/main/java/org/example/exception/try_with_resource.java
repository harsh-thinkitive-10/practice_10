package org.example.exception;

import java.io.FileReader;
import java.io.IOException;

public class try_with_resource {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("D:\\JAVA\\practice_10\\src\\main\\java\\org\\example\\exception\\customeexception\\Docs.txt")) {

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
