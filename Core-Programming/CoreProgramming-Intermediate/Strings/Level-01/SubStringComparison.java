// Write a program to create a substring from a String using the charAt() method. Also, use
// the String built-in method substring() to find the substring of the text. Finally Compare the
// the two strings and display the results
// Hint =>
// a. Take user input using the Scanner next() method to take the String variable and also
// the start and the end index to get the substring from the given text
// b. Write a method to create a substring from a string using the charAt() method with the
// string, start, and end index as the parameters
// c. Write a method to compare two strings using the charAt() method and return a boolean
// result
// d. Use the String built-in method substring() to get the substring and compare the two
// strings. And finally display the result

import java.util.Scanner;

public class SubStringComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String customSub = createSubstring(str, start, end);

        String builtInSub = str.substring(start, end);

        boolean result = compareStrings(customSub, builtInSub);

        System.out.println("Substring using charAt(): " + customSub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("Are both substrings equal? " + result);

        sc.close();
    }

    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}