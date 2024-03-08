package io.zipcoder;


import java.util.Arrays;

import static java.util.List.of;


/**
 * @author tariq
 */
public class StringsAndThings {

//    /**
//     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
//     * but not the 'y' in "yellow" (not case-sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
//     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
//     * example : countYZ("fez day"); // Should return 2
//     *           countYZ("day fez"); // Should return 2
//     *           countYZ("day fyyyz"); // Should return 2
//     */
////    You will be using the following concepts:
////    Using the String class
////    Using the StringBuilder class
////    Using the System.out.println() method
////    There are a lot of methods in theString class. You will need to use the Java API
////    Zip Code Wilmington, Copyright © 2024 - All Rights Reserved.
////    documentation to find the methods you need to use. You will also need to use the StringBuilder class to create the output. You will need to use the System.out.print() method to print out the numbers in the correct format. What’s the “newline” character? You will need to use it to get the output to look like the example.
    public Integer countYZ(String input) {
        int count = 0;
        String[] inputArray = input.split("[^a-zA-Z]"); {
            for(String userInput : inputArray) {
                if(userInput.toLowerCase().trim().endsWith("y") || userInput.toLowerCase().trim().endsWith("z"))
                    count++;
            }
        }
        return count;
    }

//    /**
//     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
//     * been removed (not case-sensitive). You may assume that the remove string is length 1 or more.
//     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
//     *
//     * example : removeString("Hello there", "llo") // Should return "He there"
//     *           removeString("Hello there", "e") //  Should return "Hllo thr"
//     *           removeString("Hello there", "x") // Should return "Hello there"
//     */
    public String removeString(String base, String remove){
        return base.replace(remove, "");
    }

//    /**
//     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
//     * to the number of appearances of "not" anywhere in the string (case-sensitive)
//     *
//     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
//     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
//     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
//     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        return null;
    }

//    /**
//     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
//     * Return true if all the g's in the given string are happy.
//     * example : gHappy("xxggxx") // Should return  true
//     *           gHappy("xxgxx") // Should return  false
//     *           gHappy("xxggyygxx") // Should return  false
//     */
    public Boolean gIsHappy(String input){
        int letter1 = 'g';

        for (int i = 0; i < input.length() -1; i ++){
                if (input.charAt(i) == letter1 && input.charAt(i + 1) == letter1) {
                    return true;
                }
        }
        return false;

    }


//    /**
//     * We'll say that a "triple" in a string is a char appearing three times in a row.
//     * Return the number of triples in the given string. The triples may overlap.
//     * example :  countTriple("abcXXXabc") // Should return 1
//     *            countTriple("xxxabyyyycd") // Should return 3
//     *            countTriple("a") // Should return 0
//     */
    public Integer countTriple(String input) {
        int tripleCounter = 0;

        int i;
        for (i = 0; i <= input.length()-2; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i + 2)) {
                tripleCounter++;
            }
        }
        return tripleCounter;
    }
}
