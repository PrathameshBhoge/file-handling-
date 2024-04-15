package com.file_handling.T_Point.File_InputStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        try(FileInputStream fi = new FileInputStream("NewFile.txt")){
            int letter = fi.read();
            System.out.println((char) letter);
            fi.close();
        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
