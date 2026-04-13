// 7. Write a program to trim the leading and trailing spaces from a string using the charAt()
// method
// Hint =>
// a. Create a method to trim the leading and trailing spaces from a string using the charAt()
// method. Inside the method run a couple of loops to trim leading and trailing spaces and
// determine the starting and ending points with no spaces. Return the start point and end
// point in an array
// b. Write a method to create a substring from a string using the charAt() method with the
// string, start, and end index as the parameters
// c. Write a method to compare two strings using the charAt() method and return a boolean
// result
// d. The main function calls the user-defined trim and substring methods to get the text after
// trimming the leading and trailing spaces. Post that use the String built-in method trim()
// to trim spaces and compare the two strings. And finally display the result

import java.util.Scanner;

public class TrimSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        String ansstr = substringString(str);
        System.out.println("Substring after triming spaces via user defined method:"+ansstr);
        String inBuiltStr = str.trim();
        System.out.println("Substring after using trim function:"+inBuiltStr);

        if(compareFunction(ansstr, inBuiltStr)){
            System.out.println("Both the substring are same");
        }else{
            System.out.println("Both the substrings are different");
        }

    }
    
    public static int[] trimSpace(String str){
        int startind=0;
        while(str.charAt(startind)==' '){
            startind++;
        }
        int endind=str.length()-1;
        while(str.charAt(endind)==' '){
            endind--;
        }

        return new int[]{startind,endind};
    }

    public static String substringString(String str){
        return str.substring(trimSpace(str)[0],trimSpace(str)[1]+1);
    }

    public static boolean compareFunction(String str1,String str2){
        return str1.equals(str2);
    }
}
