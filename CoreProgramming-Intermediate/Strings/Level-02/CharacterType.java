// 6. Write a program to find vowels and consonants in a string and display the character type -
// Vowel, Consonant, or Not a Letter
// Hint =>
// a. Create a method to check if the character is a vowel or consonant and return the result.
// The logic used here is as follows:
// i. Convert the character to lowercase if it is an uppercase letter using the ASCII values
// of the characters
// ii. Check if the character is a vowel or consonant and return Vowel, Consonant, or Not
// a Letter
// b. Create a Method to find vowels and consonants in a string using charAt() method and
// return the character and vowel or consonant in a 2D array
// c. Create a Method to display the 2D Array of Strings in a Tabular Format
// d. Finally, the main function takes user inputs, calls the user-defined methods, and displays
// the result.

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String lowerStr = toLowerCase(str);

        String[][] result = resultVowelAndConsonant(lowerStr);

        display(result);

        sc.close();
    }
    public static String toLowerCase(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            ans = ans + ch;
        }

        return ans;
    }

    public static String checkString(char ch) {

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    public static String[][] resultVowelAndConsonant(String str) {

        int len = str.length();
        String[][] ans = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            ans[i][0] = String.valueOf(ch);
            ans[i][1] = checkString(ch);        
        }

        return ans;
    }
    public static void display(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }
}
