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

    int countNode(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    void addAtPosition(int pos,int data){
        Node newNode = new Node(data);
        if(pos<countNode()+2){
            Node temp = head;
            while(pos-2!=0){
                temp=temp.next;
                pos--;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        else {
            System.out.println("Invalid position");
        }
    }

    void deleteFirst(){
        if(head == null)
            return;
        else {
            head = head.next;
        }
    }

    void deleteLast(){
        if(head==null)
            return;
        if(countNode()==1)
            head = null;
        else {
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void deleteAtPosition(int pos){
        if(pos>countNode()){
            System.out.println("Invalid position to delete");
        }
        else {
            Node temp = head;
            while(pos-2!=0){
                temp = temp.next;
                pos--;
            }
            temp.next = temp.next.next;
        }
    }
}