package com.file_handling.T_Point.File_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        try(FileOutputStream fo = new FileOutputStream("NewFile.txt")){
            String s = "write something to the file";

            byte b []= s.getBytes();
            fo.write(b);
            fo.close();

            System.out.println("Operation sucessful.");

        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
