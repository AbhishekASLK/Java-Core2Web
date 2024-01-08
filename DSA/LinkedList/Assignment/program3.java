// 3.Linked List Insertion

// Create a link list of size N according to the given input literals. Each integer input is
// accompanied by an indicator which can either be 0 or 1. If it is 0, insert the integer in the
// beginning of the link list. If it is 1, insert the integer at the end of the link list.

// Hint: When inserting at the end, make sure that you handle NULL explicitly.

// Example 1:
// Input:
// LinkedList: 9->0->5->1->6->1->2->0->5->0
// Output: 5 2 9 5 6

// Explanation:
// Length of Link List = N = 5
// 9 0 indicated that 9 should be inserted in the beginning. Modified
// Link List = 9.
// 5 1 indicated that 5 should be inserted in the end. Modified Link
// List = 9,5.
// 6 1 indicated that 6 should be inserted in the end. Modified Link
// List = 9,5,6.
// 2 0 indicated that 2 should be inserted in the beginning. Modified
// Link List = 2,9,5,6.
// 5 0 indicated that 5 should be inserted in the beginning. Modified
// Link List = 5,2,9,5,6.
// Final linked list = 5, 2, 9, 5, 6.

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
class LinkedList {
    Node head = null;

    void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    void printLL(){
        if(head==null)
            System.out.println("LinkedList is empty!");
        else {
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+ " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    void addLast(int data){
        Node newNode = new Node(data);
        if(head==null)
            head = newNode;
        else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}

class Test {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // addFirst
        ll.addFirst(40);
        ll.addFirst(20);
        ll.addFirst(10);

        // addLast
        ll.addLast(50);

        // printLL
        ll.printLL();
    }
}