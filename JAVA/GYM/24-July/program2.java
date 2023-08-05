
class MyThread extends Thread {

	public void run() {
		
		System.out.println(Thread.currentThread());
	}
}

class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread());
			
		MyThread obj = new MyThread();
		obj.start();
		
		//System.out.println(obj);

		//Thread.sleep(2000);

		obj.setName("Core2web");
	
		//System.out.println(Thread.currentThread());
	}
}
