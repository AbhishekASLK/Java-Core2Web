// 3. If you are not overriding the run() method

class MyThread extends Thread {

	
}

class ThreadDemo {

	public static void main(String[] args){
	
		// Thread instantiation (main-thread create child class object)
		MyThread t = new MyThread();

		// starting of thread by main-thread
		t.start();
	}
}


