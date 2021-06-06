package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);
        System.out.print( "What is the input string? ");
        String inpString = Obj.nextLine();
        int stringLength = inpString.length();
        System.out.print(String.format("%s has %d characters.", inpString, stringLength));
    }
}
