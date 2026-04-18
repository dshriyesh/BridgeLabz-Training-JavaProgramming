
import java.util.Scanner;

// 3. Merge Two Sorted Lists (Easy)
// Description: Merge two sorted linked lists into one sorted list.
// Input:
// list1 = [1,2,4]
// list2 = [1,3,4]
// Output: [1,1,2,3,4,4]

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //list 1 input
        System.out.print("Enter size of list1: ");
        int n1 = sc.nextInt();

        Node head1 = null, tail1 = null;

        for (int i = 0; i < n1; i++) {
            System.out.print("Enter node to add: ");
            int val = sc.nextInt();
            Node temp = new Node(val);

            if (head1 == null) {
                head1 = tail1 = temp;
            } else {
                tail1.next = temp;
                tail1 = temp;
            }
        }
        System.out.println();

        //list 2 input 
        System.out.print("Enter size of list2: ");
        int n2 = sc.nextInt();

        Node head2 = null, tail2 = null;

        for (int i = 0; i < n2; i++) {
            System.out.print("Enter node to add: ");
            int val = sc.nextInt();
            Node temp = new Node(val);

            if (head2 == null) {
                head2 = tail2 = temp;
            } else {
                tail2.next = temp;
                tail2 = temp;
            }
        }

        Node merged = merge(head1, head2);

        // result
        Node temp = merged;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // merge method
    static Node merge(Node head1, Node head2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tail.next = new Node(head1.data);
                head1 = head1.next;
            } else {
                tail.next = new Node(head2.data);
                head2 = head2.next;
            }
            tail = tail.next;
        }

        while (head1 != null) {
            tail.next = new Node(head1.data);
            head1 = head1.next;
            tail = tail.next;
        }

        while (head2 != null) {
            tail.next = new Node(head2.data);
            head2 = head2.next;
            tail = tail.next;
        }

        return dummy.next;
    }
}