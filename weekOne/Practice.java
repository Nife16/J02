package weekOne;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        
        int[] numArray = {1,2,3,54,231312312,32,34,2332,432423,234,23423,3,4,5,6};

        int[] copy = new int[numArray.length];

        for (int i = 0; i < copy.length; i++) {
            copy[i] = numArray[i];
        }
       
        System.arraycopy(numArray, 0, copy, 0, numArray.length);

        copy = numArray.clone();
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
