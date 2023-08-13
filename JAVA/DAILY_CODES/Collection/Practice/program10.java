import java.util.*;

class MyThread1 extends Thread {
	
	Vector v;

	MyThread1(Vector v){
		this.v=v;
	}

	public void run(){
		v.addElement(10);
	}
}

class MyThread2 extends Thread {

	Vector v;

	MyThread2(Vector v){
		this.v=v;
	}

	public void run(){
		v.addElement(20);
	}
}

class MyThread extends Thread {

	public static void main(String[] args){

		Vector v = new Vector();

		MyThread1 t1 = new MyThread1(v);
		MyThread2 t2 = new MyThread2(v);
		
		t1.start();
		t2.start();

		try {
			Thread.sleep(1000);
		}catch(InterruptedException ie){}

		System.out.println(v);
	}
}
