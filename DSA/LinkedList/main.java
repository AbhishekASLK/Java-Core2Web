
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

        // countNode
        System.out.println(ll.countNode());

        // addAtPosition
        ll.addAtPosition(3, 30);
        ll.printLL();

        // deleteFirst
        //ll.deleteFirst();
        //ll.printLL();

        // deleteLast
        //ll.deleteLast();
        //ll.printLL();

        // deleteAtPosition
        ll.deleteAtPosition(3);
        ll.printLL();
    }
}