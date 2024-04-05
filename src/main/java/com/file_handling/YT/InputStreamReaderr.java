package com.file_handling.YT;

import java.io.IOException;
import java.io.InputStreamReader;

//it convert the bytestream to charstrem
public class InputStreamReaderr {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter a lettter : ");
           int letter =  isr.read();

            while(isr.ready()){
                System.out.println((char) letter);
                letter = isr.read();
            }
            isr.close();
            System.out.println();

        }catch(IOException io){
            System.out.println("Unexpected error occurred ! ");
            io.printStackTrace();
        }
    }
}
