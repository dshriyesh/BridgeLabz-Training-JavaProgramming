package SinglyLinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

}

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node = new Node(20);
        head.next=node;
        displayFun(head);
        // 10 -> 20
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to add new nodes: ");
        char ch=sc.next().charAt(0);
        while(ch=='y'||ch=='Y'){
            System.out.print("Enter value: ");
            int data = sc.nextInt();
            Node temp=new Node(data);
            node.next=temp;
            node=temp;
            displayFun(head);
            System.out.print("Do you want to add new nodes: ");
            char newch=sc.next().charAt(0);
            if(newch=='y'||newch=='Y'){
                newch=ch;
            }
            else {
                break;
            }
        }
    }
    static void displayFun(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
}
