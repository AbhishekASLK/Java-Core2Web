
class MyThread extends Thread {

	public void run(){
		System.out.println(getName());
	}
}

class ThreadDemo {

	public static void main(String[] args) {
	
		MyThread obj = new MyThread();
		obj.start();

		// destroy
		obj.destroy();
	}
}
