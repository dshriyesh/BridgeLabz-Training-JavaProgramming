// Min Stack (Medium)
// Description:
// Design a stack that supports push, pop, top, and retrieving the minimum element in constant
// time.
// Input:
// push(3), push(5), getMin(), push(2), getMin()
// Output:
// 3, 2

import java.util.ArrayList;
import java.util.Scanner;

class Stack{
    int size=0;
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> min = new ArrayList<>();

    void push(int x){
        if(size==0){
            min.add(x);
        }else{
            min.add(Math.min(x,min.get(size-1)));
        }
        arr.add(x);
        size++;
    }

    int pop(){
        if(size==0){
            System.out.println("Stack is already empty!!");
            return -1;
        }
        else{
            int top=arr.get(size-1);

            arr.remove(size-1);

            min.remove(size-1);

            size--;

            return top;
        }
    }

    int top(){
        if(size==0){
            System.out.println("Stack is already empty!!");
            return -1;
        }
        return arr.get(size-1);
    }

    int min(){
         if(size==0){
            System.out.println("Stack is already empty!!");
            return -1;
        }
        return min.get(size-1);
    }

    void display(){
        System.out.println(arr);
    }

    void displayMin(){
        System.out.println(min);
    }
}

public class MinStack {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(2);
        st.push(4);
        st.display();
        st.displayMin();
        st.push(9);
        st.pop();
        System.out.println(st.top());
        st.push(10);
        st.push(1);
        System.out.println(st.min());
    }    
}
