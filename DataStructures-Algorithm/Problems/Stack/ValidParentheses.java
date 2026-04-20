// Valid Parentheses (Easy)
// Description:
// Check whether the input string has valid and properly nested parentheses.
// Input:
// s = "()[]{}"
// Output:
// true

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String with parentheses: ");
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }

    static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else {

                if(st.isEmpty()) return false;

                if(ch == ')' && st.peek() == '('){
                    st.pop();
                }
                else if(ch == '}' && st.peek() == '{'){
                    st.pop();
                }
                else if(ch == ']' && st.peek() == '['){
                    st.pop();
                }
                else {
                    return false; 
                }
            }
        }
        return st.isEmpty();
    }
    
}
