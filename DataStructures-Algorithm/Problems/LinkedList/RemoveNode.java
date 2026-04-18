
import java.util.Scanner;

// 4. Remove Nth Node From End of List (Medium)
// Description:
// Remove the nth node from the end of the linked list.
// Input:
// head = [1,2,3,4,5], n = 2
// Output:
// [1,2,3,5]

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class RemoveNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int n1=sc.nextInt();

        Node dummy=new Node(0);
        Node head=dummy;
        for(int i=0;i<n1;i++){
            System.out.println("Enter node to add: ");
            int val = sc.nextInt();

            Node temp = new Node(val);

            dummy.next=temp;
            dummy=dummy.next;
        }
        head=head.next;
        System.out.println("Enter the position of node to remove: ");
        int pos = sc.nextInt();

        int frontpos = n1-pos;
        Node temp=head;
        for(int i=0;i<frontpos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        Node node= head;
        while(node!=null){
            System.out.print(node.data+" -> ");
            node=node.next;
        }
        System.out.println("null");
    }
}
