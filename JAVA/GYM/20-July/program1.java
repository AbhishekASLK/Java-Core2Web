
class MyThread extends Thread {

	public void run(){
		
		System.out.println(Thread.currentThread().getName());
		MyThread.m1();
	}

	public static void m1() {
	
		System.out.println(Thread.currentThread().getName());
	}
}

class Test {

	public static  void main(String[] args) {
	
		MyThread obj = new MyThread();
		obj.start();
		
		System.out.println(Thread.currentThread().getName());
		//MyThread.m1();
	}
}
