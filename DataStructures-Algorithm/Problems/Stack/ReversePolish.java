// Evaluate Reverse Polish Notation (Medium)
// Description:
// Evaluate the value of an arithmetic expression in Reverse Polish Notation.
// Input:
// tokens = ["2","1","+","3","*"]
// Output:
// 9

import java.util.*;

public class ReversePolish {
    public static void main(String[] args) {

        String[] tokens = {"2","1","+","3","*"}; 
        System.out.println("Result: " + evalRPN(tokens));
    }

    static int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for(String token : tokens){

            if(token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/")){

                int num1 = st.pop();
                int num2 = st.pop();

                switch(token){
                    case "+": st.push(num2 + num1); break;
                    case "-": st.push(num2 - num1); break;
                    case "*": st.push(num2 * num1); break;
                    case "/": st.push(num2 / num1); break;
                }
            }
            else{
                st.push(Integer.parseInt(token)); 
            }
        }

        return st.pop();
    }
}