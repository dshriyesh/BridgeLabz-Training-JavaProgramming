// 2. Find unique characters in a string using the charAt() method and display the result
// Hint =>
// a. Create a Method to find the length of the text without using the String method length()
// b. Create a method to Find unique characters in a string using the charAt() method and
// return them as a 1D array. The logic used here is as follows:
// i. Create an array to store the unique characters in the text. The size is the length of
// the text
// ii. Loops to Find the unique characters in the text. Find the unique characters in the text
// using a nested loop. An outer loop iterates through each character and an inner loop
// checks if the character is unique by comparing it with the previous characters. If the
// character is unique, it is stored in the result array
// iii. Create a new array to store the unique characters
// c. Finally, the main function takes user inputs, calls the user-defined methods, and displays
// the result.

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int len = findLength(str);

        char[] unique = findUniqueCharacters(str, len);

        System.out.print("Unique Characters: ");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
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

    public static char[] findUniqueCharacters(String str, int len) {

        char[] temp = new char[len]; // temporary array
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
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // final array of exact size
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
