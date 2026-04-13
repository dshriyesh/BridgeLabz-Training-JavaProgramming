// 4. Write a program to split the text into words and find the shortest and longest strings in a
// given text
// Hint =>
// a. Take user input using the Scanner nextLine() method
// b. Create a Method to split the text into words using the charAt() method without using the
// String built-in split() method and return the words.
// c. Create a method to find and return a string's length without using the length() method.
// d. Create a method to take the word array and return a 2D String array of the word and its
// corresponding length. Use String built-in function String.valueOf() to generate the String
// value for the number
// e. Create a Method that takes the 2D array of word and corresponding length as
// parameters, find the shortest and longest string and return them in an 1D int array.
// f. The main function calls the user-defined methods and displays the result.

import java.util.Scanner;

public class SplitStringAndCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        int wordCount = countWords(text);
        int[] spaceIndexes = indexArray(text, wordCount - 1);

        String[][] result = wordArray(text, spaceIndexes, wordCount);

        // Display
        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]); // convert String → int
            System.out.println(result[i][0] + "\t" + len);
        }

        String smallestString = longestAndSmallest(result)[0];
        String largestString = longestAndSmallest(result)[1];

        System.out.println("Smallest String is: "+smallestString);
        System.out.println("Largest String is: "+largestString);

    }

    //length without using length()
    public static int findLength(String str) {
        int cnt = 0;
        try {
            while (true) {
                str.charAt(cnt);
                cnt++;
            }
        } catch (Exception e) {
        }
        return cnt;
    }

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

    //space indexes
    public static int[] indexArray(String str, int spaceCount) {
        int[] indexes = new int[spaceCount];
        int i = 0, j = 0;

        try {
            while (true) {
                if (str.charAt(i) == ' ') {
                    indexes[j++] = i;
                }
                i++;
            }
        } catch (Exception e) {
        }

        return indexes;
    }

    //2D array → word + length
    public static String[][] wordArray(String str, int[] indexes, int wordCount) {
        String[][] words = new String[wordCount][2];

        int start = 0;
        int i;

        // Extract words between spaces
        for (i = 0; i < indexes.length; i++) {
            String word = str.substring(start, indexes[i]);
            words[i][0] = word;
            words[i][1] = String.valueOf(findLength(word)); //

            start = indexes[i] + 1;
        }

        // Last word
        String lastWord = str.substring(start);
        words[i][0] = lastWord;
        words[i][1] = String.valueOf(findLength(lastWord)); 

        return words;
    }

    public static String[] longestAndSmallest(String[][]wordArray) {

        int min=Integer.MAX_VALUE;
        int minidx =0;
        
        int max = Integer.MIN_VALUE;
        int maxidx = 0;

        for(int i=0;i<wordArray[0].length;i++){
            if(Integer.parseInt(wordArray[i][1])>max){
                max=Integer.parseInt(wordArray[i][1]);
                maxidx=i;
            }
            if(Integer.parseInt(wordArray[i][1])<min){
                min=Integer.parseInt(wordArray[i][1]);
                minidx=i;
            }
        }

        return new String[]{wordArray[minidx][0],wordArray[maxidx][0]};

    }
}
