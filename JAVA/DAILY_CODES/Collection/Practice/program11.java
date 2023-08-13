import java.util.HashSet;

class HashDemo {

	public static void main(String[] args){
	
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(10);

		System.out.println(hs);
	}
}
