// Description:
// Determine if the linked list has a cycle.
// Input: head = [3,2,0,-4], pos = 1
// Output: true

public class LinkedListCycle {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        Node temp=new Node(2);
        head.next=temp;
        temp.next=new Node(0);
        temp.next.next=new Node(4);
        temp.next.next.next=temp;

        int pos = detectCycle(head);

        if (pos != -1)
            System.out.println("Cycle detected at index: " + pos);
        else
            System.out.println("No cycle detected");
        
    }

    static int detectCycle(Node head){
        if(head==null) return -1;
        Node fast=head;
        Node slow=head;
       while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node temp = head;
                int index = 0;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                    index++;
                }
        return index;
        }
    }
    return -1;
}
}
