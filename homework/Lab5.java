package homework;

import java.util.Scanner;

public class Lab5 {
    

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        // 1)
        // System.out.println("Whats the word, bird: ");
        // String string = scr.nextLine();
        // System.out.println("Whats the letter, fetter: ");
        // String stringLetter = scr.nextLine();
        // char letter = stringLetter.charAt(0);
        // countTheNumberOfOccurencesOfACharArray(string, letter);


        // 2)
        System.out.println("Whats the word, bird: ");
        String string = scr.nextLine();
        removeWhiteSpaces(string);

        // 3)
        // removeDupes("dupeyloopey");

        // 4)
        // reverseString("dupey is loopey");

        scr.close();
        
    }

    
    //1. Write a method to count the number of occurrences of the letter ‘a’ in a char array?
    public static void countTheNumberOfOccurencesOfACharArray(String string, char letter) {

        // Create a char array
        char[] charArr = string.toCharArray();
        // create a variable count to keep track of occurences
        int count = 0;
        // loop through the array for each index
        for (int i = 0; i < charArr.length; i++) {
            // if the index value is the letter, add to the count
            if(charArr[i] == letter) {
                count++;
            }
        }

        // after loop has finished, print out number of count occurences
        System.out.println(count);

    }

    //2. Write a method to remove all white spaces from a char array?

    public static void removeWhiteSpaces(String string) {

        // create char array
        char[] charArr = string.toCharArray();

        // we must count the white spaces to make a new array that will not have the spaces
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
             // if the index value is the letter, add to the count
             if(charArr[i] == ' ') {
                count++;
            }
        }

        // create new array now we know its size, originalArrSize - count
        char[] newArr = new char[charArr.length-count];

        // loop again and assign non ' ' values to new array
        // add a count to keep track of newArr index
        int newArrIndex = 0;
        for (int i = 0; i < charArr.length; i++) {
            // if the index is not ' ' add to new array
            if(charArr[i] != ' ') {
                newArr[newArrIndex] = charArr[i];
                //increment new arr index
                newArrIndex++;
            }
        }

        System.out.print("no white space string:->   ");
        System.out.println(newArr);

    }

    //3. Write a method to find duplicate characters in a char array?

    public static void removeDupes(String string) {

        // boolean firstDupe = false;

        String stringCopy = string;

        for (int i = 0; i < string.length(); i++) {
            
            for (int j = i+1; j < string.length(); j++) {

                if(string.charAt(i) == string.charAt(j)) {

                    stringCopy = stringCopy.replaceAll(Character.toString(string.charAt(i)), "");
                    break;

                }

            }

        }

        System.out.println(stringCopy);

    }


    //4. Write a method to display the words in reverse order.  “How are you” should be displayed “you are How”

    public static void reverseString(String string) {

        // you are How 
        String[] strArr = string.split(" ", 0);

        String reverse = "";

        for (int i = 0; i < strArr.length; i++) {

            reverse = strArr[i] + " " + reverse;
            
        }


        System.out.println(reverse);

        // uoy era woH
        String reverse2 = "";


        for (int i = string.length()-1; i >= 0; i--) {

            reverse2 = reverse2.concat(Character.toString(string.charAt(i)));
            
        }

        System.out.println(reverse2);

    }


}
