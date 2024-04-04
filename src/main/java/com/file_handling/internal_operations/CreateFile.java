package com.file_handling.internal_operations;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        OutputStream fout= new FileOutputStream("Info.txt");
        byte [] b = str.getBytes();
        fout.write(b);
        fout.close();

    }
}
