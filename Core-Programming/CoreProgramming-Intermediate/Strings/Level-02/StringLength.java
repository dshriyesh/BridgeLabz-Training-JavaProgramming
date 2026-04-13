// Write a program to find and return the length of a string without using the length() method
// Hint =>
// a. Take user input using the Scanner next() method
// b. Create a method to find and return a string's length without using the built-in length()
// method. The logic for this is to use the infinite loop to count each character till the
// charAt() method throws a runtime exception, handles the exception, and then return
// the count
// c. The main function calls the user-defined method as well as the built-in length() method
// and displays the result

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();

        int customLength = findLength(str);
        int actualLength = str.length();

        System.out.println("Length of string using custome method: "+actualLength );
        System.out.println("Length of string using in-built method: "+customLength );
    }
    public static int findLength(String str){
        int cnt=0;
        try {
            while(true){
                str.charAt(cnt);
                cnt++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        return cnt;
    }
}
