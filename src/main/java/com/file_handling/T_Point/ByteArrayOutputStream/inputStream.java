package com.file_handling.T_Point.ByteArrayOutputStream;

import java.io.ByteArrayInputStream;

public class inputStream {
    public static void main(String[] args) {
        byte b[] = {35,36,37,38};

        ByteArrayInputStream byt = new ByteArrayInputStream(b);
        int i =0;
        while((i=byt.read()) != -1){
            char ch = (char) i;
            System.out.println("Ascii value : "+ i+" Letter is : "+ch);
        }
    }
}
