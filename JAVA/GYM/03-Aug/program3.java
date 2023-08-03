class A {

	public synchronized void d1(B b){
	
		System.out.println("Thread-1 Start execution of d1() method");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie){}
		System.out.println("Thread-1 trying to call B's last() method");		b.last();
	}

	public synchronized void last(){
		System.out.println("Inside A, last() method");
	}
}

class B {

	public synchronized void d2(A a){
	
		System.out.println("Thread-2 Start execution of d2() method");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie){}
		System.out.println("Thread-2 trying to call A's last() method");		a.last();
	}

	public synchronized void last(){
		System.out.println("Inside B, last() method");
	}
}

class Deadlock extends Thread {

	A a = new A();
	B b = new B();

	public void m1(){
	
		this.start();
		a.d1(b); // line executed by main-thread

	}

	public void run(){
	
		b.d2(a); // line executed by child-thread
	}
	
	public static void main(String[] args){
	
		Deadlock t = new Deadlock();
		t.m1();

	}
}
