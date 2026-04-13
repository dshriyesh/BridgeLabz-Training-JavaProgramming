// Write a program to return all the characters in a string using the user-defined method,
// compare the result with the String built-in toCharArray() method, and display the result
// Hint =>
// a. Take user input using the Scanner next() method to take the text into a String variable
// b. Write a method to return the characters in a string without using the toCharArray()
// c. Write a method to compare two string arrays and return a boolean result
// d. In the main() call the user-defined method and the String built-in toCharArray() method,
// compare the 2 arrays, and finally display the result

import java.util.Scanner;

public class StringCharacters {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] customArray = getCharacters(str);

        char[] builtInArray = str.toCharArray();

        boolean result = compareArrays(customArray, builtInArray);

        System.out.print("Custom char array: ");
        printArray(customArray);

        System.out.print("Built-in char array: ");
        printArray(builtInArray);

        System.out.println("Are both arrays equal? " + result);

        sc.close();
    }

    public static char[] getCharacters(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
