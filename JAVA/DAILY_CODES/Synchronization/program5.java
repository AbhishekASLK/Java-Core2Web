import java.util.*;

class MyThread extends Thread {
	
	Vector v;

	MyThread(Vector v){
		this.v=v;
	}

	public void run(){
		
	}
}

class SyncDemo {

	public static void main(String[] args){
	
		Vector v = new Vector();

		MyThread t1 = new MyThread(v);
		MyThread t2 = new MyThread(v);

		t1.start();

		System.out.println(v);
		t2.start();

		try {
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
		System.out.println(v);
	}
}
