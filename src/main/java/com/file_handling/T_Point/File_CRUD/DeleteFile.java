package com.file_handling.T_Point.File_CRUD;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("NewFile.txt");
        if(file.delete()){
            System.out.println("File delted successfully.");
        }else {
            System.out.println("Operation Denied");
        }
    }
}
