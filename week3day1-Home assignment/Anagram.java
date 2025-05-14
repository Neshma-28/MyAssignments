package week3.day1;

import java.util.Arrays;

public class Anagram {

 public static boolean anagram(String text1, String text2) {
    	//char in an array set
    	char[] text1Array = text1.toCharArray();
        char[] text2Array = text2.toCharArray();
        //sort the two array set
        Arrays.sort(text1Array);
        Arrays.sort(text2Array);

        // Compare sorted strings
        return Arrays.equals(text1Array, text2Array);
    }

    public static void main(String[] args) {
        String text1 = "stops";
        String text2 = "potss";
        //if condition
        if (anagram(text1, text2)) {
            System.out.println(text1 + " and " + text2 + " are anagrams.");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagrams.");
        }
    }
    }



