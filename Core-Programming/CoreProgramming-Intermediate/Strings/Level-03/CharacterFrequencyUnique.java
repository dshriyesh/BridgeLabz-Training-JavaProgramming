// 5. Write a program to find the frequency of characters in a string using unique characters and
// display the result
// Hint =>
// a. Create a method to Find unique characters in a string using the charAt() method and
// return them as a 1D array. Use Nested Loops to find the unique characters in the text
// b. Create a method to find the frequency of characters in a string and return the characters
// and their frequencies in a 2D array. The logic used here is as follows:
// i. Create an array to store the frequency of characters in the text. ASCII values of
// characters are used as indexes in the array to store the frequency of each character.
// There are 256 ASCII characters
// ii. Loop through the text to find the frequency of characters in the text
// iii. Call the uniqueCharacters() method to find the unique characters in the text
// iv. Create a 2D String array to store the unique characters and their frequencies.
// v. Loop through the unique characters and store the characters and their frequencies
// c. In the main function take user inputs, call user-defined methods, and displays result.

import java.util.Scanner;

public class CharacterFrequencyUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String[][] result = frequencyWithUnique(str);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] uniqueCharacters(String str) {

        int len = findLength(str);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[uniqueCount++] = current;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static String[][] frequencyWithUnique(String str) {

        int[] freq = new int[256];

        int len = findLength(str);

        // Step 1: count frequency
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        char[] unique = uniqueCharacters(str);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            char ch = unique[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }
}
