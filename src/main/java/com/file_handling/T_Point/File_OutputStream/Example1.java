package com.file_handling.T_Point.File_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
     try(FileOutputStream fo = new FileOutputStream("NewFile.txt")){
         //It automatically converts the Ascii vaolue to alphabet
         fo.write(65);
         // FioleWriter doesn't support auto close
         fo.close();
     }catch(IOException io ){
         io.printStackTrace();;
     }
    }
}
