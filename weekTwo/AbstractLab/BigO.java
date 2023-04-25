package weekTwo;

import java.util.Scanner;

public class BigO {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // O(1)
        // No loops at all, the program will run as fast as the machine can
        // the size of the data does not determine how fast the proram will run
        // The fastest notaion
        System.out.print("Give me an index of a letter in the alphabet: ");
        int choice = scr.nextInt();

        System.out.println(alphabet[choice]);
        

        // O(log n)
        // You have a loop, but you are shortening the size of that loop
        // so you don't have to loop as much
        // your program will run faster because your loop will not have as much
        // of a block on the program being shortened

        /* find the letter, end after you find it */
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == 'j') {
                System.out.println("found it");
                break;
            }
        }

        // O(n)
        // You have a loop (of any kind)
        // Your program will run as fast as the size of the data set
        // So the larger the data set, the longer it will take the program to run
        
        /*check for a dupe of 'a' */
        for (int i = 0; i < alphabet.length; i++) {
            
            if(alphabet[i] == 'a') {
                System.out.println("dupe");
            }
        }


        // O(n^2) (n squared)
        // Nested loopage, not ideal, but sometimes it has to happen
        // When you have a situation where you need to have a loop inside of
        // another loop, you get this notation.
        // Sometimes it unavoidable, like with 2d Arrays
        // or when you have to compare an array against itself
        // Dont feel ashemed for having 1 nested loop, feel ashed for more than one

        /* find dupes for each letter in alphabet */


        for (int i = 0; i < alphabet.length; i++) {
            
            for (int j = i+1; j < alphabet.length; j++) {
                
                if(alphabet[i] == alphabet[j]) {
                    System.out.println("dupe");
                }

            }

        }
    }

}
