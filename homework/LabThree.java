package homework;

import java.util.Scanner;

public class LabThree {
    
    public static void main(String[] args) {
        
        // removeCharFromString();
        // anotherRemoveDupes();
        // countVandE();
        removeDupes();
    }

    public static void removeCharFromString() {
        /* DONE IN 2 WAYS, WITHOUT REPLACEALL AND WITH IT */

        // 1. Write a method to remove a given character from a string.
        // E.g. remove all 'A or a (capital or lowercase)' from Average should return verge
        // (core logic only, no .replace or .replaceAll)

        Scanner scr = new Scanner(System.in);

        System.out.print("Whats the word bird: ");
        String word = scr.nextLine();

        System.out.println("Whats the letter.... fetter: ");
        String letterAsString = scr.nextLine();
        char letter = letterAsString.charAt(0);
        char letterUpperCase = letterAsString.toUpperCase().charAt(0);


        
        // WITHOUT REPLACEALL HERE

        //create a char[] of the word
        char[] wordCharArr = word.toCharArray();
        char[] newWordWithoutLetter = new char[wordCharArr.length];
        for (int i = 0; i < wordCharArr.length; i++) {
            // this first loop will find all occurences of the letter
            if(wordCharArr[i] != letter && wordCharArr[i] != letterUpperCase) {
                newWordWithoutLetter[i] = wordCharArr[i];
            } else {
                newWordWithoutLetter[i] = ' ';
            }
        }

        System.out.println(newWordWithoutLetter);



        
        // WITH REPLACE HERE

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter) {
                word = word.replace(Character.toString(letter), "");
            }
        }
        System.out.println(word);

        scr.close();
    }

    public static void anotherRemoveDupes() {


        // i need to get a word from my user
        Scanner scr = new Scanner(System.in);
        System.out.print("Whats the word bird: ");
        String string = scr.nextLine();
        String dupeIndexes = "";
        boolean first = true;

        // find the dupes in the word


        // i need to compare the first letter to the others, and onwards in the string
        // find all the duplicate indexes

        for (int i = 0; i < string.length()-1; i++) {
            for (int j = i+1; j < string.length(); j++) {

                if(dupeIndexes.contains(Integer.toString(i))) {
                    break;
                }

                if(string.charAt(i) == string.charAt(j)) {
                    if(first) {
                        first = false;
                        dupeIndexes = dupeIndexes.concat(Integer.toString(i));
                    }
                    dupeIndexes = dupeIndexes.concat(Integer.toString(j));
                }
            }
            first = true;
        }

        // remove the indexes in the dupes list from the original string

        char[] wordWithReplacedLetters = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
                
            if(!dupeIndexes.contains(Integer.toString(i))) {
                wordWithReplacedLetters[i] = string.charAt(i);
            }
        }

        System.out.println(wordWithReplacedLetters);
        

    }

    // this is both 2 and 4, it finds and removes dupes and adds to the end of string in sout
    public static void removeDupes() {
        //2. Write a method to remove duplicate characters from a string.

        //4. Write a method to display first non repeated character of a string then the repeating characters.
        //E.g. input morning should display morignn.

        Scanner scr = new Scanner(System.in);
        System.out.print("Whats the word bird: ");
        String string = scr.nextLine();
        String dupes = "";
        boolean foundDupe = false;
    
    	for (int i = 0; i < string.length(); i++) {

    		for (int j = i+1; j < string.length(); j++) {
				
    			if((string.charAt(i) == string.charAt(j))) {

                    String stringChar = Character.toString(string.charAt(j));
    				dupes = dupes.concat(stringChar);
                    if(!foundDupe) {
                        dupes = dupes.concat(Character.toString(string.charAt(i)));
                        foundDupe = true;
                    }
    				break;
    			}
				
			}
            foundDupe = false;
			
		}

        for (char letter : dupes.toCharArray()) {
            string = string.replaceAll(Character.toString(letter), "");
        }

    	System.out.println(string + " : " +  dupes);

        scr.close();
    }

    public static void countVandE() {
        // 3. Write a method to count the number of vowels and consonants in a string.
        // E.g. if the input is Java the result should be 2 vowels and 2 consonants .

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        Scanner scr = new Scanner(System.in);
        System.out.print("Whats the word bird: ");
        String string = scr.nextLine();
        int vowelCount = 0;
        int constCount = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(string.charAt(i) == vowels[j]) {
                    vowelCount++;
                }
            }
        }

        constCount = string.length() - vowelCount;

        System.out.println(constCount);
        System.out.println(vowelCount);

        scr.close();
    }
}
