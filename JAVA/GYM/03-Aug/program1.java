
class ThreadB extends Thread {

	int total = 0;

	public void run(){
		
		synchronized(this){
			System.out.println("child-thread start calculation..");

			for(int i=0;i<=100;i++){
				total+=i;
			}

			System.out.println("child-thread trying to give notification..");
			this.notify();
		}

	}
}

class ThreadA extends Thread {

	public static void main(String[] args) throws InterruptedException {
	
		ThreadB b = new ThreadB();
		b.start();
		
		for(int i=0;i<1000000;i++);
		synchronized(b){
			b.wait();
		}

		System.out.println(b.total);
	}
}
