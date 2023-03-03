package weekOne.notes;

import java.util.ArrayList;

public class Arrays {
    


    public static void main(String[] args) {
        
        /*
         * Arrays are a collection of data types,
         * so a collection of Integers, or Booleans
         * They are used to store multiple values all under one variable
         * Instead of making 5 variables to hold 5 numbers, you can make one array
         */

        // The array is declared with [] next to the type
        // the type says what data type the array will hold
        // the [] denotes that it is an array
        // you need the new key word to CONSTRUCT a new array
        // the [5] on the right shows how big the array will be
        // this is an array of size 5, index always starts at 0
        int[] numArray = new int[5];

        // Primitive Arrays
        // primitive arrays are your most basic array
        // they can only be assigned a size once, after that it cant change
        // they don't come with any functions either, being primitive
        // they have a length property that will give you size of the array
        String[] stringArray = new String[3];

        // to look at each index, you will always use a for loop like such
        // i starts at 0, cause all arrays start the index at 0
        // i should never be equal to or bigger than the length
        // the last index of any array is always length-1
        // the loop will increment each time, so the index will go from 0 to the end
        for (int i = 0; i < stringArray.length; i++) {

            // to access the value at each index, you give the index number in the []
            // FOR LOOPS AND ARRAYS ARE BUTT BUDDIES, for loops easily index your arrays
            // without going out of bounds as long as you set them up correctly in the args
            // if you need to use multiple values from your array, a loop is almost necessary
            System.out.println(stringArray[i]);
            
        }

        // Non primitive Arrays
        // non primitive arrays are arrays that come from Classes
        // the benefit of them are they come with lots of functions to make your logic easier
        // non primitive arrays do not need to be declared with size
        // they can be dynamically added to and removed from with the .add or .remove functions
        // inside the <> you put the datatype that you are using the array for
        // like primitive arrays, you can only have 1 datatype inside the array
        // so it you declare ArrayList<Integer>, only integers can be put in the array
        ArrayList<Integer> nonPrimArray = new ArrayList<Integer>();
        // same as length, gets you the amount of indexes (starts counting from 1)
        nonPrimArray.size();
        // gets you the array value at a given index
        nonPrimArray.get(0);
        // add will put an element on the array, creating a new index at the end
        nonPrimArray.add(1);
        // remove, you give it in index number in the args, and that index will be removed
        nonPrimArray.remove(0);
        // removes all indexes from array
        nonPrimArray.clear();
        // checks if the value you give as an arg is inside the array, returns a boolean
        nonPrimArray.contains(1);
        // sorts your array, if given null as arg it will sort Ascending
        nonPrimArray.sort(null);

    }
}
