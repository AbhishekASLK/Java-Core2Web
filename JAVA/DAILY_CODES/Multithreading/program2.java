// 2. Overloading of run() method

// Defining a Thread
class MyThread extends Thread {

	public void run(){
		// Job of Thread
		for(int i=0;i<10;i++)
			System.out.println("Child Thread");
	}
	
	public void run(int ix){
		// Job of Thread
		for(int i=0;i<10;i++)
			System.out.println("Child Thread");
	}
}

class ThreadDemo {

	public static void main(String[] args){
	
		// Thread instantiation (main-thread create child class object)
		MyThread t = new MyThread();

		// starting of thread by main-thread
		t.run();

		// executed by main-thread
		for(int i=0;i<10;i++)
			System.out.println("Main Thread");
	}
}


