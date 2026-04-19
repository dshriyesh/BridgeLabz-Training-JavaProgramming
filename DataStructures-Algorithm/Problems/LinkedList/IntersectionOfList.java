//  Intersection of Two Linked Lists (Easy)
// Description:
// Find the node where two linked lists intersect.
// Input:
// listA = [4,1,8,4,5]
// listB = [5,6,1,8,4,5]
// Output:
// Node with value 8

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null; 
    }
}

public class IntersectionOfList {

    public static void main(String[] args) {

        Node common = new Node(8);
        common.next = new Node(4);
        common.next.next = new Node(5);

        Node head1 = new Node(4);
        head1.next = new Node(1);
        head1.next.next = common; 

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(1);
        head2.next.next.next = common; 

        printList(head1);
        printList(head2);

        Node intersection = getIntersectionNode(head1, head2);

        if (intersection != null)
            System.out.println("Intersection at node: " + intersection.data);
        else
            System.out.println("No intersection");
    }

    static Node getIntersectionNode(Node head1, Node head2) {

        Node d1 = head1;
        Node d2 = head2;

        while (d1 != d2) {
            d1 = (d1 == null) ? head2 : d1.next;
            d2 = (d2 == null) ? head1 : d2.next;
        }

        return d1; 
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}