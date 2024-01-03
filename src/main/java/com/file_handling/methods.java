package com.file_handling;

import java.io.File;

public class methods {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/91749/OneDrive/Documents/Project Clgg/CyberChat.docx");
            if(file.exists()){
                System.out.println("File found");
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
            }
            else {
                System.out.println("File not found");
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//exists()
//canRead()
//canWrite()
