// Given a singly linked list. The task is to find the length of the linked list, where length is defined
// as the number of nodes in the linked list.

// Example 1:
// Input:
// LinkedList: 1->2->3->4->5
// Output: 5
// Explanation: Count of nodes in the linked list is 5, which is its length.

// Example 2:
// Input:
// LinkedList: 2->4->6->7->5->1->0
// Output: 7
// Explanation: Count of nodes in the linked list is 7. Hence, the output
// is 7.

// Expected Time Complexity : O(N)
// Expected Auxiliary Space : O(1)
// Constraints:
// 1 <= N <= 10^5
// 1 <= value <= 10^3

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

    int countNode(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

}
class Test {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        System.out.println(ll.countNode());
    }
}