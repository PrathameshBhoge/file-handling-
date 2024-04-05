package com.file_handling.internal_operations;

import java.io.FileInputStream;

public class Readfile {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("Info.txt");
        byte b[]= new byte[20];
        fin.read(b);
        String s = new String(b);
        System.out.println(s);
        fin.close();

    }
}
