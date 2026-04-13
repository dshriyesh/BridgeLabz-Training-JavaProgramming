// Write a program to split the text into words and return the words along with their lengths in a
// 2D array
// Hint =>
// a. Take user input using the Scanner nextLine() method
// b. Create a Method to split the text into words using the charAt() method without using the
// String built-in split() method and return the words.
// c. Create a method to find and return a string's length without using the length() method.
// d. Create a method to take the word array and return a 2D String array of the word and its
// corresponding length. Use String built-in function String.valueOf() to generate the String
// value for the number
// e. The main function calls the user-defined method and displays the result in a tabular
// format. During display make sure to convert the length value from String to Integer and
// then display

import java.util.Scanner;

public class SplitStringWithLength {
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

        sc.close();
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
        words[i][1] = String.valueOf(findLength(lastWord)); //

        return words;
    }
}