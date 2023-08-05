
class MyThread implements Runnable {
	
	public void run() {
		
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}

class ThreadDemo {

	public static void main(String[] args) throws InterruptedException  {
	
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
		
	}
}
