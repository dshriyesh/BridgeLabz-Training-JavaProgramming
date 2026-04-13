// Write a program to check if two texts are anagrams and display the result
// Hint =>
// a. An anagram is a word or phrase formed by rearranging the same letters to form different
// words or phrases,
// b. Write a method to check if two texts are anagrams. The logic used here is as follows:
// i. Check if the lengths of the two texts are equal
// ii. Create an array to store the frequency of characters in the strings for the two text
// iii. Find the frequency of characters in the two texts using the loop
// iv. Compare the frequency of characters in the two texts. If the frequencies are not
// equal, return false
// c. In the main function take user inputs, call user-defined methods, and displays result.

import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);

        if (result) {
            System.out.println("The strings are ANAGRAMS ✅");
        } else {
            System.out.println("The strings are NOT anagrams ❌");
        }

    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
