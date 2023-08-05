// 4. Overriding of start() method

class MyThread extends Thread {

	public void start(){
		super.start();
		System.out.println("start method");
	}
	
	public void run(){
		System.out.println("run method");
	}
}

class ThreadDemo {
	
	public static void main(String[] args){
		
		MyThread t = new MyThread();
		t.start();
		System.out.println("main method");
	}

}
