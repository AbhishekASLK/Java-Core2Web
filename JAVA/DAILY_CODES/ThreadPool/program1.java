import java.util.concurrent.*;

class MyThread implements Runnable {
	int n;
	MyThread(int n){
		this.n=n;
	}

	static void dailyTask(){
		try {
			Thread.sleep(2000);
		}catch(InterruptedException ie){}
	}

	public void run(){
		System.out.println(Thread.currentThread().getName()+"...thread started"+n);
		dailyTask();
		System.out.println(Thread.currentThread().getName()+"...thread ended"+n);
	}
}

class Client {

	public static void main(String[] args){
	
		ExecutorService service = Executors.newFixedThreadPool(3);

		for(int i=1;i<=6;i++){
			MyThread obj = new MyThread(i);
			service.execute(obj);
		}
		service.shutdown();
	}
}
