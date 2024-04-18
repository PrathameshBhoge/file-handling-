package com.file_handling.T_Point.File_CRUD;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("NewFile.txt");

            f.write("In Java, FileWriter does not have an " +
                    "autoClose feature built into it. However, since Java " +
                    "7, you can use try-with-resources to automatically close resources such " +
                    "as file streams, including FileWriter. This is generally the recommended " +
                    "approach for handling resources that need to be closed after use to " +
                    "prevent resource leaks and ensure proper cleanup.");

            f.close();
            System.out.println("Operation Sucessful");
        } catch (IOException e) {
            System.out.println("Operation dnied");
            throw new RuntimeException(e);
        }
    }
}
