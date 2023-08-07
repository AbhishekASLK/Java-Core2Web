import java.util.*;

class LinkedListDemo {

	public static void main(String[] args) {
	
		// java.util.LinkedList$Node<E> node(int);


		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		LinkedList.Node l = ll.node(0);
	}
}
