// Write a program to to check if a text is palindrome and display the result
// Hint =>
// a. A palindrome is a word, phrase, number, or other sequence of characters that reads the
// same forward and backward
// b. Logic 1: Write a method to compare the characters from the start and end of the string
// to determine whether the text is palindrome. The logic used here is as follows:
// i. Set the start and end indexes of the text
// ii. Loop through the text and compare the characters from the start and the end of the
// string. If the characters are not equal, return false
// c. Logic 2: Write a recursive method to compare the characters from the start and end of
// the text passed as parameters using recursion. The logic used here is as follows:
// i. First, check if the start index is greater than or equal to the end index, then return
// true.
// ii. If the characters at the start and end indexes are not equal, return false.
// iii. Otherwise, call the method recursively with the start index incremented by 1 and the
// end index
// d. Logic 3: Write a Method to compare the characters from the start and end of the text
// using character arrays. The logic used here is as follows:
// i. Firstly Write a Method to reverse a string using the charAt() method and return the
// reversal array.
// ii. Create a character array using the String method toCharArray() and also create a
// reverse array. Compare the characters in the original and reverse arrays to do a
// Palindrome check
// e. Finally, in the main method do palindrome check using the three logic and display result


import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        // Logic 1
        boolean result1 = logic1(str);

        // Logic 2
        boolean result2 = logic2(str, 0, str.length() - 1);

        // Logic 3
        boolean result3 = logic3(str);

        // Display results
        System.out.println("\nUsing Logic 1 (Loop): " + result1);
        System.out.println("Using Logic 2 (Recursion): " + result2);
        System.out.println("Using Logic 3 (Array): " + result3);

        sc.close();
    }

    // Logic 1: Iterative (two pointers)
    public static boolean logic1(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive
    public static boolean logic2(String str, int start, int end) {

        if (start >= end) return true;

        if (str.charAt(start) != str.charAt(end)) return false;

        return logic2(str, start + 1, end - 1); // ✅ FIXED
    }

    // Logic 3: Using arrays
    public static boolean logic3(String str) {

        char[] original = str.toCharArray();
        char[] reversed = reverseString(str);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    // Reverse string using charAt()
    public static char[] reverseString(String str) {

        char[] rev = new char[str.length()];
        int index = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev[index++] = str.charAt(i);
        }

        return rev;
    }
}