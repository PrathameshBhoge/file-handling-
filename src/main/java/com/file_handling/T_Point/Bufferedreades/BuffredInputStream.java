package com.file_handling.T_Point.Bufferedreades;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BuffredInputStream {
    public static void main(String[] args) {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Newfile.txt"))){
            int i =0;
            while((i = bis.read()) != -1){
                System.out.print((char) i );
            }
        }catch(IOException io){
            io.printStackTrace();;
        }
    }
}
