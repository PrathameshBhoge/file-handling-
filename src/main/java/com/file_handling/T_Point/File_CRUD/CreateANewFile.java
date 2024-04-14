package com.file_handling.T_Point.File_CRUD;

import java.io.File;
import java.io.IOException;

public class CreateANewFile {
    public static void main(String[] args) {
        try{
            File file = new File("NewFile.txt");
            if(file.createNewFile()){
                System.out.println("File already exists. ");
            }else{
                System.out.println("file created");
            }

        }catch(Exception io){
                io.printStackTrace();
        }
    }
}
