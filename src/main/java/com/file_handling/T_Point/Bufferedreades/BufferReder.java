package com.file_handling.T_Point.Bufferedreades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


// It converts byte to char stream and read it.
public class BufferReder {
    public static void main(String[] args) {
        String s = "Info.txt";
        buffeerFileRed(s);


        bufferedInputStrem();
    }

    public static void bufferedInputStrem(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("You typed : "+ br.readLine());
        }catch(IOException io){
            io.printStackTrace();
        }
    }

    public static void buffeerFileRed(String s){
        try(BufferedReader br = new BufferedReader(new FileReader(s))){
            while (br.ready()){
                System.out.println(br.readLine());
            }

        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
