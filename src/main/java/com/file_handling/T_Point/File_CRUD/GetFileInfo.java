package com.file_handling.T_Point.File_CRUD;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File file = new File("NewFile.txt");

        if(file.exists()){
            System.out.println("Is File is writable - "+ file.canWrite());

            System.out.println("Is File Readable - "+ file.canRead());

            System.out.println("File absolute path - "+ file.getAbsolutePath());

            System.out.println("File size - "+file.length());

            System.out.println("File Name - "+file.getName());
        }else{
            System.out.println("File Does not exixts. ");
        }
    }
}
