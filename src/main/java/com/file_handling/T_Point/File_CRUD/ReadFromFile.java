package com.file_handling.T_Point.File_CRUD;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("NewFile.txt");) {
           int letter = fileReader.read();

           while(fileReader.ready()){
               System.out.print((char) letter);
               letter = fileReader.read();
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
