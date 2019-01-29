package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        boolean wantsToContinue = true;
        String exit = "1";

       do{
           System.out.println("Enter a word to see if it's a palindrome or press [1] to exit");
           userInput = scan.nextLine();

           if(userInput.equals(exit)){
               wantsToContinue = false;
               System.out.println("Thank you! Goodbye");
           } else {

               String[] userInputInArray = userInput.split("");
               String [] flippedArray = new String[userInputInArray.length];

               int indexOfFlippedArray = 0;

               for(int i = userInputInArray.length - 1; i >= 0; i--){

                   flippedArray[indexOfFlippedArray] = userInputInArray[i];

                   indexOfFlippedArray++;
               }

               String flippedArrayAsString =  String.join("", flippedArray);

               String userInputUpperCase = userInput.toUpperCase();
               String flippedArrayAsStringUpperCase = flippedArrayAsString.toUpperCase();

               if(flippedArrayAsStringUpperCase.equals(userInputUpperCase)){
                   System.out.println("The word " + userInput + " is a palindrome!!");
               } else {
                   System.out.println("The word " + userInput + " is not a palindrome.");
               }
           }
       } while(wantsToContinue);

    }
}
