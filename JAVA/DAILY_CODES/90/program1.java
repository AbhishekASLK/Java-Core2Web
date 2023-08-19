import java.util.*;

class Products implements Comparable {

	String name;
	int pid;

	Products(int pid, String name){
		this.name=name;
		this.pid=pid;
	}

	public String toString(){
		return name+"("+pid+")";
	}

	public int compareTo(Object o){
		return pid-((Products)o).pid;
	}
}

class HashMapSort {

	public static void main(String[] args){
	
		HashMap m = new HashMap();

		m.put(new Products(566,"Yahoo"),"10Cr");
		m.put(new Products(876,"Google"),"55Cr");
		m.put(new Products(122,"Snapchat"),"24Cr");
		m.put(new Products(222,"Apple-II"),"89Cr");

		TreeMap tm = new TreeMap(m);
	
		System.out.println(tm);
	}
}
