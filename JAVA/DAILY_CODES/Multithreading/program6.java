
class MyThread extends Thread {
	static Thread mt;

	public void run(){
			
		try {
			mt.join();
		}
		catch(InterruptedException ie){
		
		}
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}

class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
	
		MyThread.mt = Thread.currentThread();
		MyThread obj = new MyThread();
		obj.start();
		obj.join();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}
}
