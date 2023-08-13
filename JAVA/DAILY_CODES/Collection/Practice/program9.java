/* --------------------- Vector -------------------------- */

import java.util.*;

class VectorDemo {

	/*--------- public java.util.Vector(int, int); --------------*/
	
	public static void main(String[] args){
		
		Vector v = new Vector(3,5);

		System.out.println(v.capacity());

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		System.out.println(v.capacity());

		v.add(50);
		v.add(50);
		v.add(50);
		v.add(50);
		v.add(50);
		
		System.out.println(v.capacity());
	}
}
