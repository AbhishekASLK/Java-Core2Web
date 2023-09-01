import java.util.*;

class QueueMethod {

	public static void main(String[] args){
	
		Queue q = new PriorityQueue();

  		// boolean add(E);
		
		q.add(10);
		q.add(50);
		q.add(20);
		q.add(40);
		q.add(30);
		System.out.println(q); // [10, 30, 20, 50, 40]

  		// boolean offer(E);

		q.offer(70);
		System.out.println(q); // [10, 30, 20, 50, 40, 70]
  		
		// E remove();

		q.remove();
		System.out.println(q); // [20, 30, 70, 50, 40] throws NoSuchElementException if q is empty
		

  		// E poll();
		q.poll();
		System.out.println(q); // [30, 40, 70, 50]

  		// E peek();
		System.out.println(q.peek());
		
		Queue q1 = new PriorityQueue();

		// E element();
		q1.element(); // throws NoSuchElementException if q1 is empty.
		
	}

}

// ------------------------ Output ----------------------------

/* 
[10, 30, 20, 50, 40]
[10, 30, 20, 50, 40, 70]
[20, 30, 70, 50, 40]
[30, 40, 70, 50]
30
Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.AbstractQueue.element(AbstractQueue.java:136)
	at QueueMethod.main(QueueMethods.java:39)
*/
