package com.file_handling.YT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRederr {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:/business-financial-data-december-2023-quarter-csv.csv")){
            int  letter = fr.read();
            while(fr.ready()){
                System.out.print((char) letter);
                letter = fr.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
