// Add Two Numbers (Medium)
// Description:
// Add two numbers represented by linked lists (digits stored in reverse order).
// Input:
// l1 = [2,4,3]
// l2 = [5,6,4]
// Output:
// [7,0,8]

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list 1 size: ");
        int n1 = sc.nextInt();
        Node head1 = listInput(sc, n1);

        System.out.print("Enter list 2 size: ");
        int n2 = sc.nextInt();
        Node head2 = listInput(sc, n2);

        Node result = addTwoNumbers(head1, head2);

        // Display result
        Node temp = result;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        sc.close();
    }

    // Input list
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

    // Core logic
    static Node addTwoNumbers(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            tail.next = new Node(sum % 10);
            carry = sum / 10;

            tail = tail.next;
        }

        return dummy.next;
    }
}