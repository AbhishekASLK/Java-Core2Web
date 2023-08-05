
class MyThread extends Thread {

	public void run() {
		
		System.out.println(Thread.currentThread());
	}
}

class ThreadDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
			
		MyThread obj = new MyThread();
		obj.start();

		obj.setName("Core2web");
	
		System.out.println(Thread.currentThread());
	}
}
