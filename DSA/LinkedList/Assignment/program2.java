// 2.Find length of Loop

// Given a linked list of size N. The task is to complete the function countNodesinLoop() that
// checks whether a given Linked List contains a loop or not and if the loop is present then return
// the count of nodes in a loop or else return 0. C is the position of the node to which the last node
// is connected. If it is 0 then no loop.

// Example 1:
// Input:
// N = 10
// value[]={25,14,19,33,10,21,39,90,58,45}
// C = 4
// Output: 7

// Explanation: The loop is 45->33. So
// length of loop is 33->10->21->39->
// 90->58->45 = 7. The number 33 is
// connected to the last node to form the
// loop because according to the input the
// 4th node from the beginning(1 based
// index) will be connected to the last
// node for the loop.

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

    public boolean hasCycle() {
        if(head==null)
            return false;
        if(head.next==null)
            return false;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)
                return true;
        }
        return false;
    }

    void createLink(int index){
        Node temp = head;
        while(--index>0){
            temp = temp.next;
        }
        Node temp2 = head;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = temp;
    }
}

class Test {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        ll.createLink(2);
        System.out.println(ll.hasCycle());
    }
}