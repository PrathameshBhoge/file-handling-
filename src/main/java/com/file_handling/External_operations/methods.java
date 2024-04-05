package com.file_handling.External_operations;

import java.io.File;

public class methods {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/91749/OneDrive/Documents/Project Clgg");
            if(file.exists()){
                System.out.println("File found");
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.isFile());
                System.out.println(file.isDirectory());
               File f[] = file.listFiles();
               for(int i=0;i<f.length;i++){
                   System.out.println(f[i]);
               }
            }
            else {
                System.out.println("File not found");
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//exists() -- it checks whether your file exixts or not
//canRead() -- it checks whether your file is readbele or not
//canWrite() -- it checks whether your file is writable  or not
//isfile()
//isDirectory()
//listFiles()
