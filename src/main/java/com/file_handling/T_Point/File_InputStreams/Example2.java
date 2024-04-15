package com.file_handling.T_Point.File_InputStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        try(FileInputStream fi = new FileInputStream("Newfile.txt")){
            int letter = 0;

            while((letter = fi.read()) != -1){
                System.out.print((char) letter);
            }
        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
