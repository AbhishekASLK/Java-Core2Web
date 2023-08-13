import java.util.*;

class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();
		
		ll.add(20);

		// Methods

		// 1. void addFirst(E);
		ll.addFirst(10);

		// 2. void addLast(E);
		ll.addLast(30);

		// 3. E getFirst(); 
		//System.out.println(ll.getFirst());

		// 4. E getLast(); 
		//System.out.println(ll.getLast());

		// 5. E get(int);
		//System.out.println(ll.get(0));
		
		//System.out.println(ll);

  		// 6. E set(int, E);
		//System.out.println(ll.set(0,369));

		// 7. E removeFirst();
		//ll.removeFirst();

  		// 8. E removeLast();
		//ll.removeLast();

		// 9. E peekFirst();
		//System.out.println(ll.peekFirst());

		// 10. E peekLast();
		//System.out.println(ll.peekFirst());
		
		// 11. E element();
		//System.out.println(ll.element());

		// 12. E peek();
		//System.out.println(ll.peek());

		// 13. E remove(); 
		//System.out.println(ll.remove());

		System.out.println(ll);

	}
}
