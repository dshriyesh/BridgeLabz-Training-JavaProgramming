// 5. Write a program to find vowels and consonants in a string and display the count of Vowels
// and Consonants in the string
// Hint =>
// a. Create a method to check if the character is a vowel or consonant and return the result.
// The logic used here is as follows:
// i. Convert the character to lowercase if it is an uppercase letter using the ASCII values
// of the characters
// ii. Check if the character is a vowel or consonant and return Vowel, Consonant, or Not
// a Letter
// b. Create a Method to find vowels and consonants in a string using charAt()
// method and finally return the count of vowels and consonants in an array
// c. Finally, the main function takes user inputs, calls the user-defined methods, and displays
// the result.

import java.util.Scanner;

public class VowelConsonantsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");

        String str = sc.nextLine();

        String lowerStr = LowerCase(str);
        System.out.println(lowerStr);

        System.out.println("Number of vowels are : "+countVowelandConsonant(lowerStr)[0]);
        System.out.println("Number of consonants are: "+countVowelandConsonant(lowerStr)[1]);
    }

     public static String LowerCase(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);

            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }

            ans=ans+ch;
        }
        return ans;
    }

    public static String checkString(char ch){
        
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'|| ch=='u'){
                return "vowel";
            }
            else{
                return "consonant";
            }
            }
            return "not a letter";
        
    }

    public static int[] countVowelandConsonant(String str){
        int vcnt=0;
        int ccnt=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(checkString(ch)=="vowel"){
                vcnt++;
            }
            if(checkString(ch)=="consonant"){
                ccnt++;
            }
        }
        return new int[]{vcnt,ccnt};
    }
}
