package com.file_handling.i_o_streams;

import java.io.FileInputStream;
import java.io.InputStream;

public class inputstream {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = new FileInputStream("Info.txt");
        int data;
        while((data=inputStream.read()) != -1){
            System.out.print((char) data);
        }

    }
}
