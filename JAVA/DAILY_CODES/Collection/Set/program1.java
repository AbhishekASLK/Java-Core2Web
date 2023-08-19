/* Set

Duplicates are not allowed.
insertion order is not preserved.

Collection --------> Set (I)
Set interface doesn't contain any new method, all methods of Collection(I) is inherited only.

Collection ---------> Set(I) ------------> HashSet(C) ----------> LinkedHashSet(C) 
 				------------> SortedSet(I) --------> NavigableSet(I) ----------> TreeSet(C);


=============================== HashSet =====================================

import java.util.*;

class HashSetDemo {

	public static void main(String[] args){
	
		HashSet h = new HashSet();

		System.out.println(System.identityHashCode(h));
		
		for(int i=0;i<20;i++)
			h.add(i);

		System.out.println(System.identityHashCode(h));
		System.out.println(h);
	}

}

=============================== LinkedHashSet ===================================== 

1. duplicates are not allowed.
2. insertion order is preserved.

import java.util.*;

class LinkedHashSetDemo {

	public static void main(String[] args){
	
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(10);

		System.out.println(hs);
	}
}

=============================== SortedSet ===================================== 

1. duplicates are not allowed.
2. insertion order is not preserved.*/
