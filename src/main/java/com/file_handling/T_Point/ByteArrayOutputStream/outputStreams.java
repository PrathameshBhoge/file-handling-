package com.file_handling.T_Point.ByteArrayOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

public class outputStreams {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("f1.txt");
            FileOutputStream fileOutputStream1 = new FileOutputStream("F2.txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fileOutputStream);
            bout.writeTo(fileOutputStream1);

            System.out.println("Sucess...");


        }catch(IOException io ){
            io.printStackTrace();
        }

    }
}
