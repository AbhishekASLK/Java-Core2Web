import java.util.*;

class MyThread extends Thread {

	ArrayList v;

	MyThread(ArrayList v){
		this.v=v;
	}

	public void run(){
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(v);
		v.add(80);
		v.add(90);
		v.add(100);
		System.out.println(v);
	}
}

class SyncDemo {

	public static void main(String[] args){
	
		ArrayList v = new ArrayList();

		MyThread t1 = new MyThread(v);
		MyThread t2 = new MyThread(v);

		t1.start();
		t2.start();
	}
}
