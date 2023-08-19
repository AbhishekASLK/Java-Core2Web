import java.util.*;

class Test {

	public static void main(String[] args){
	
		SortedMap sm = new TreeMap();
		sm.put("Ind","India");
		sm.put("Pak","Pakistan");
		sm.put("SL","SriLanka");
		sm.put("Ban","Bangladesh");

		System.out.println(sm);

		Set<Map.Entry> data =  sm.entrySet();
	       	Iterator<Map.Entry> itr = data.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
			Map.Entry m = itr.next();
			System.out.println(m.getKey()+" ----- "+m.getValue());
		}	
	}
}
