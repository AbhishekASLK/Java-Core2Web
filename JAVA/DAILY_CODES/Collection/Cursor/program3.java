import java.util.*;

class IteratorDemo {

	public static void main(String[] args){
	
		ArrayList l = new ArrayList();

		Iterator i = l.iterator();
		System.out.println(i.getClass().getName());
		
		Vector v = new Vector();
		
		Enumeration e = v.elements();
		System.out.println(e.getClass().getName());

		ListIterator le = v.listIterator();
		System.out.println(le.getClass().getName());
	
	}
}
