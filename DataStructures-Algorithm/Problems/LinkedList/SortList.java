// Sort List (Medium)
// Description:
// Sort a linked list in ascending order.

// Input:
// head = [4,2,1,3]
// Output:
// [1,2,3,4]

import java.util.Scanner;

class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
}

public class SortList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list size: ");
        int n1 = sc.nextInt();
        Node head = listInput(sc, n1);
        Node tail=null;

        Node newNode = merge(head);

        System.out.println("Sorted linked list is: ");
        Node temp=newNode;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    static Node merge(Node head){
        if(head==null || head.next == null ) return head;
        Node slow = head;
        Node fast = head.next; 

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        Node middle = slow;

        Node right = middle.next;
        middle.next=null;
        Node left = head;

        left = merge(left);
        right = merge(right);

        return mergeList(left,right);
    }

    static Node mergeList(Node left,Node right){
        Node dummy=new Node(0);
        Node head=dummy;
        while(right!=null && left!=null){
            if(right.data<=left.data){
                dummy.next=right;
                dummy=dummy.next;
                right=right.next;
            }else{
                dummy.next=left;
                dummy=dummy.next;
                left=left.next;
            }
            
        }

        if (right != null) {
            dummy.next = right;
        } else {
            dummy.next = left;
        }
        return head.next;
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
}
