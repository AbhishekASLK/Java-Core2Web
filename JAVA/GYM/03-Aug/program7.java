class MyThread extends Thread {

	public void run(){
	
		for(int i=0;i<10;i++){
			System.out.println("child-thread");
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
	}
}

class Client {

	public static void main(String[] args){
	
		MyThread t = new MyThread();
		t.start();
		
		System.out.println("end of the main-thread");
		t.resume();
		//t.suspend();
		//t.stop();
	}
}
