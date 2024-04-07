package com.file_handling.T_Point.Consol;

import java.io.Console;

public class ConsolCreater {
    public static void main(String[] args) {
        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
    }
}
