// 1. Reverse Linked List (Easy)
// Description:
// Reverse a singly linked list.
// Input:
// head = [1,2,3,4,5]
// Output:
// [5,4,3,2,1]

class ReverseLinkedList{
    int data;
    ReverseLinkedList next;

    ReverseLinkedList(int data){
        this.data=data;
        this.next=null;
    }

    public static void main(String[] args) {
        ReverseLinkedList head = new ReverseLinkedList(1);
        ReverseLinkedList node=head;
        for(int i=2;i<=5;i++){
            ReverseLinkedList temp=new ReverseLinkedList(i);
            node.next=temp;
            node=temp;
        }
        ReverseLinkedList newnode = reverse(head);
        ReverseLinkedList temp=newnode;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    static ReverseLinkedList reverse(ReverseLinkedList head){
        if(head == null || head.next==null) return head;
        ReverseLinkedList temp=head;
        ReverseLinkedList prev=null;
        while(temp!=null){
            ReverseLinkedList curr=temp;
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}