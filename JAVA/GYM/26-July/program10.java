
class MyThread extends Thread {

	public void run(){
	
		/*
		try {
			this.sleep(2000);
		}
		catch(InterruptedException ie){
			
		}
		*/
	}

}


class Test {

	public static void main(String[] args)throws InterruptedException {
	
		MyThread obj1 = new MyThread();	
		MyThread obj2 = new MyThread();	
		MyThread obj3 = new MyThread();
		
		obj1.start();	
		obj2.start();	
		obj3.start();	
		
		Thread.currentThread().sleep(3000);
		System.out.println(Thread.activeCount());
	}
}
