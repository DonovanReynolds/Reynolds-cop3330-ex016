package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 16 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        String ageText = inputOutput("What is your age?");
        int age = stringToInt(ageText);

        System.out.println(age < 16 ? "You are not old enough to legally drive." : "You are old enough to legally drive");

    }
    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

    public static int stringToInt(String text)
    {
        return Integer.parseInt(text);
    }

    public static double stringToDouble (String text)
    {
        return Double.parseDouble(text);
    }
}
