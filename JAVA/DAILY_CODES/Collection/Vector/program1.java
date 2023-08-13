import java.util.*;

class VectorDemo {

	public static void main(String[] args) {
	
		Vector v = new Vector();
		
		System.out.println(v.capacity());
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		System.out.println(v.capacity());
	}
}
