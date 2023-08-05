class MyThread extends Thread {


	public void run(){
	
		System.out.println(Thread.currentThread().getPriority());
	}

}

class Test {

	public static void main(String[] args){
	
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		MyThread t = new MyThread();
		t.start();
	}
}
