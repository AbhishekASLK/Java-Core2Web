
class MyThread extends Thread {
	
}


class Test {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread obj = new MyThread();
		obj.start();	
		
		// main thread will execute parallely with MyThread(thread-0) class content, that means obj still have its ThreadGroup
		System.out.println(obj);
		// but when we
		obj.sleep(1000);
		System.out.println(obj.getThreadGroup());
	}
}
