class MyThread extends Thread {


}

class Test {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().isDaemon());
	
		//Thread.currentThread().setDaemon(true);

		MyThread t = new MyThread();
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}
}
