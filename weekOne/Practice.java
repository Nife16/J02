package weekOne;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        
        // Write a method that tells if a word is a palindrome


        System.out.println("What is the string");

        Scanner scr = new Scanner(System.in);

        String myString = scr.nextLine(); 

        // reverseString(myString);
        // evenCharacters(myString);
        palindrome(myString);

    }

    public static void palindrome(String myString) {

        // print word, print it backwards, see if they are equal

        if(myString.equals(reverseString(myString))) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println("Its not!");
        }

    }

    public static String reverseString(String myString) {

        String backwardsMyString = "";
        for(int i = myString.length()-1; i >= 0; i--) {
            // add each letter to backwardsMyString
            backwardsMyString = backwardsMyString.concat(
                Character.toString(myString.charAt(i))
            );
        }

        return backwardsMyString;

    }

    public static void evenCharacters(String myString) {

        for(int i = 0; i < myString.length(); i+=2) {
            System.out.println(myString.charAt(i));
        }
    }

}
