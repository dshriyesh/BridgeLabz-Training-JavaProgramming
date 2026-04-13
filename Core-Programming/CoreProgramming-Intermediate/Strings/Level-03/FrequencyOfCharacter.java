// Write a program to find the frequency of characters in a string using the charAt() method and
// display the result
// Hint =>
// a. Create a method to find the frequency of characters in a string using the charAt() method
// and return the characters and their frequencies in a 2D array. The logic used here is as
// follows:
// i. Create an array to store the frequency of characters in the text. ASCII values of
// characters are used as indexes in the array to store the frequency of each character.
// There are 256 ASCII characters
// ii. Loop through the text to find the frequency of characters in the text
// iii. Create an array to store the characters and their frequencies
// iv. Loop through the characters in the text and store the characters and their
// frequencies
// b. In the main function take user inputs, call user-defined methods, and displays result.

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String[][] result = findFrequency(str);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

    }

    public static String[][] findFrequency(String str) {

        int[] freq = new int[256];

        int length = 0;

        try {
            while (true) {
                char ch = str.charAt(length);
                freq[ch]++;
                length++;
            }
        } catch (Exception e) {
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }
        String[][] result = new String[uniqueCount][2];

        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result;
    }
}
