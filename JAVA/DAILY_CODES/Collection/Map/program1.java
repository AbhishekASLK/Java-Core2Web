import java.util.*;

class HashMapDemo {

	public static void main(String[] args){
	
		HashMap h = new HashMap();
		System.out.println(h.put("g","Abhi"));
		System.out.println(h.put(2,"Shashi"));

		h.put(3,"Yog");
		h.put(4,"Shub");
		h.put(5,"Raj");

		System.out.println(h);
	}
}
