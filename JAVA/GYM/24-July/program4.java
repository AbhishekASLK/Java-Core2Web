
class MyThread extends Thread {

	public void run(){
		Thread.yield();
		for(int i=0;i<10;i++){
			System.out.println("in thread-0");
		}
	}
}

class ThreadDemo {

	public static void main(String[] args) {
	
		MyThread obj = new MyThread();
		obj.start();

		for(int i=0;i<10;i++){
			System.out.println("in main thread");
		}
	}
}
