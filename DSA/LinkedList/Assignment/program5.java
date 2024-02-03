// 5. Reverse a linked list
// Given a linked list of N nodes. The task is to reverse this list.
// Example 1:
// Input:
// LinkedList: 1->2->3->4->5->6
// Output: 6 5 4 3 2 1
// Explanation: After reversing the list, elements are 6->5->4->3->2->1.


class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
class LinkedList {
    Node head = null;

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

    void reverse(){
        
    }
}

class Test {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);

        ll.printLL();
        ll.reverse();
    }
}