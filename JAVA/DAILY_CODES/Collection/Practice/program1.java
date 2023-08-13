import java.util.*;

class CollectionDemo extends ArrayList {

	public static void main(String[] args){
	
		ArrayList al = new ArrayList();
		
		// 1. boolean add(E);
		al.add(10);
		al.add(5.6);
		al.add("Shashi");
		al.add(5.6);
		
		// 2. int size();
		System.out.println(al.size());

		// 3. boolean isEmpty();
		System.out.println(al.isEmpty());

		// 4. boolean contains(Object);
		System.out.println(al.contains("Shashi"));

		// 5. int indexOf(Object)
		// ArrayList ------------ [10, 5.6, Shashi, 5.6] ---------------------------------
		System.out.println(al.indexOf("Shashi"));

		// 6. int lastIndexOf(Object);
		System.out.println(al.lastIndexOf(5.6));

		// 7. Object clone();
		Object obj = al.clone();
		System.out.println(obj);

		// 8. Object[] toArray();
		Object arr[] = al.toArray();
		for(Object ele: arr)
			System.out.print(ele+" ");
		System.out.println();

		// 9. E get(int);
		System.out.println(al.get(2));

 		// 10. E set(int, E);
		System.out.println(al.set(2,"Shashi Bagal"));
		System.out.println(al);

		// ------------------------------- Updated List: [10, 5.6, Shashi Bagal, 5.6] ----------------------------

  		// 11. void add(int, E);
		al.add(2,"Core2Web");
		System.out.println(al);
  		
		// ------------------------------- Updated List: [10, 5.6, Core2Web, Shashi Bagal, 5.6] -------------------
		// 12. E remove(int);
		System.out.println(al.remove(2));
		
  		// 13. boolean equals(Object);

		ArrayList AL1 = new ArrayList();
		AL1.add(10);
		
		ArrayList AL2 = new ArrayList();
		AL2.add(10);

		System.out.println(AL1.equals(AL2));

		// 14. int hashCode();
		System.out.println(al.hashCode());

		// 15. boolean remove(Object);
		System.out.println(al.remove("Core2Web"));
		System.out.println(al);
		
		// 16. void clear();
		al.clear();
		System.out.println(al);

		// 17. public boolean addAll(Collection);

		CollectionDemo arr1 = new CollectionDemo();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		System.out.println(arr1);
		
		ArrayList arr2 = new ArrayList();
		arr2.add(40);
		arr2.add(50);
		arr2.add(60);
		System.out.println(arr2);
		
		arr1.addAll(arr2);
		System.out.println(arr1);

  		// 18. public boolean addAll(int, Collection);

		ArrayList arr3 = new ArrayList();
		arr3.add(369);

		arr1.addAll(3,arr3);
		System.out.println(arr1);

		// 19. protected void removeRange(int, int);

		// [10, 20, 30, 369, 40, 50, 60]
		arr1.removeRange(3,7);
		System.out.println(arr1);

		// 20. boolean removeAll(Collection);
		arr1.removeAll(arr1);
		System.out.println(arr1);

  		// 21. boolean retainAll(Collection);
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);

		ArrayList b = new ArrayList();
		b.add(30);
		b.add(40);
		b.add(50);

		a.retainAll(b);
		System.out.println(a);
	}
}
