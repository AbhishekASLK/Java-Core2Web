
class MyThread extends Thread {

	MyThread(String str){
		super(str);
	}
	public void run(){
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}

class ThreadDemo {

	public static void main(String[] args) {
		
		// Step-1:
		// call to MyThread(String) constructor
		// Step-2:
		// call to Thread(String) constructor of Thread class
		// 

		MyThread obj = new MyThread("xyz");
		obj.start();
	}
}
