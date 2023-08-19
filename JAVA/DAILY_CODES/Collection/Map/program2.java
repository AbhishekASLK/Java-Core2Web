import java.util.*;

class HashMapDemo {

	public static void main(String[] args)throws InterruptedException {
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t,"durga");
		System.out.println(m); // {temp=durga}

		t=null;
		System.gc();

		Thread.sleep(5000);

		System.out.println(m);
	}
}

class Temp {

	public String toString(){
		return "temp";
	}
	public void finalize(){
		System.out.println("finalized() called");
	}
}
