// Write a program to split the text into words, compare the result with the split() method and
// display the result
// Hint =>
// a. Take user input using the Scanner nextLine() method
// b. Create a Method to find the length of the String without using the built-in length()
// method.
// c. Create a Method to split the text into words using the charAt() method without using the
// String built-in split() method and return the words. Use the following logic
// i. Firstly Count the number of words in the text and create an array to store the
// indexes of the spaces for each word in a 1D array
// ii. Then Create an array to store the words and use the indexes to extract the words
// d. Create a method to compare the two String arrays and return a boolean
// e. The main function calls the user-defined method and the built-in split() method. Call the
// user defined method to compare the two string arrays and display the result

import java.util.Scanner;

public class SplitString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        int length = findLength(text);

        int wordCount = countWords(text);

        int[] spaceIndexes = indexArray(text, wordCount - 1);

        String[] customWords = wordArray(text, spaceIndexes, wordCount);

        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(customWords, builtInWords);

        System.out.println("\nCustom Split Result:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");

        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);
    }

    // Method to find length
    public static int findLength(String str) {
        int cnt = 0;
        try {
            while (true) {
                str.charAt(cnt);
                cnt++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return cnt;
    }

    // Count words = spaces + 1
    public static int countWords(String str) {
        int spaces = 0;
        int i = 0;

        try {
            while (true) {
                if (str.charAt(i) == ' ') {
                    spaces++;
                }
                i++;
            }
        } catch (Exception e) {
        }

        return spaces + 1;
    }

    //indexes of spaces
    public static int[] indexArray(String str, int spaceCount) {
        int[] indexes = new int[spaceCount];
        int i = 0, j = 0;

        try {
            while (true) {
                if (str.charAt(i) == ' ') {
                    indexes[j] = i;
                    j++;
                }
                i++;
            }
        } catch (Exception e) {
        }

        return indexes;
    }

    //words using indexes
    public static String[] wordArray(String str, int[] indexes, int wordCount) {
        String[] words = new String[wordCount];

        int start = 0;
        int i;

        //words between spaces
        for (i = 0; i < indexes.length; i++) {
            words[i] = str.substring(start, indexes[i]);
            start = indexes[i] + 1;
        }

        // Last word
        words[i] = str.substring(start);

        return words;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }
}