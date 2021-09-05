/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //print statement asking for quote to be inputted
        System.out.println("What is the quote? ");
        //string will be inputted and stored as "quote"
        String quote = scanner.nextLine();

        //print statement asking for author to be inputted
        System.out.println("Who said it? ");
        //string will be inputted and stored as "author"
        String author = scanner.nextLine();

        //print input and response back
        System.out.format("%s says, \"%s\"", author, quote);

    }
}