// 1. Write a program to compare two strings using the charAt() method and check the result
// with the built-in String equals() method
// Hint =>
// a. Take user input using the Scanner next() method for 2 String variables
// b. Write a method to compare two strings using the charAt() method and return a boolean
// result
// c. Use the String Built-In method to check if the results are the same and display the result

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.print("Enter String 1: ");
        String str1 = sc.next();

        System.out.print("Enter String 2: ");
        String str2 = sc.next();

        if(compareMethod(str1, str2) == str1.equals(str2)){
            System.out.println("Both the methods are returning similar results that strings are equal");
        }else{
            System.out.println("Both the methods are not returning similar results");
        }
    }   
    public static boolean compareMethod(String str1,String str2){
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)!=str2.charAt(j)){
                return false;
                
            }
            i++;
            j++;
        }
        return true;
    } 
}
