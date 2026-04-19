// 7. Palindrome Linked List (Easy)
// Description:
// Check whether the linked list is a palindrome.
// Input:
// head = [1,2,2,1]
// Output:
// true

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next=next;
    }
}

public class PallindromeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list size: ");
        int n1 = sc.nextInt();
        Node head = listInput(sc, n1);

        Node newnode = reverse(head);

        while(head!=null && newnode!=null){
            if(head.data!=newnode.data){
                System.out.println("Given list is not pallindrome");
                return;
            }
            head = head.next;
            newnode=newnode.next;
        }
        System.out.println("Given list is pallindrome!!");

    }

    static Node listInput(Scanner sc, int size) {
        Node dummy = new Node(0);
        Node tail = dummy;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter node: ");
            int val = sc.nextInt();

            tail.next = new Node(val);
            tail = tail.next;
        }
        return dummy.next;
    }

    static Node reverse(Node head){
        if(head == null || head.next==null) return head;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node curr=temp;
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
