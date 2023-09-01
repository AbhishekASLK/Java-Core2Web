import java.util.*;

class MyComparator implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2){
		return o1-o2;
	}
}

class Test {

	public static void main(String[] args){
	
		PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
		pq.add(20);
		pq.add(10);
		pq.add(40);
		pq.add(50);
		pq.add(30);

		System.out.println(pq);

	}
}
