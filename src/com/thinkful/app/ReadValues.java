package com.thinkful.app;

import java.util.Scanner;
/**
    * Prompts the user for a value and reads the value
    * from the command line.
    * 
    * More information about the Scanner may be found
    * here: https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
    */
public class ReadValues {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Please enter your name:");
        String name = scanner.next();

        System.out.println("Please enter the first adjective:");
        String adjOne = scanner.next();

        System.out.println("Please enter the second adjective:");
        String adjTwo = scanner.next();

        System.out.println("Please enter your workplace:");
        String workPlace = scanner.next();

        System.out.println("Please enter adjective three:");
        String adjThree = scanner.next();

        System.out.println("Please enter adjective four:");
        String adjFour = scanner.next();

        System.out.println("Please enter a personal characteristic:");
        String personalChar= scanner.next();

        System.out.println("Please enter a personal trait:");
        String personalTrait = scanner.next();

        System.out.println("Please enter the adjective five:");
        String adjFive = scanner.next();

        System.out.println("Please enter a verb");
        String verb = scanner.next();

        System.out.println("Please enter a pronoun");
        String pronoun = scanner.next();

        scanner.close();

        System.out.printf(
            "%s is a person of an %s disposition and is %s in the %s for his %s and %s of his %s."
            + "The circumstance, added to his well-known %s and %s courage, made me very desirous to %s %s.",
            name, adjOne, adjTwo, workPlace, adjThree, adjFour, personalChar, personalTrait, 
            adjFive, verb, pronoun 
        );

    }
}