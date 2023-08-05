class MyThread extends Thread {

	public void run(){
		for(int i=1;i<=1000;i++){
			System.out.println("I am Lazy Thread- "+i);
		}
		System.out.println("I am entering into sleeping state");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			System.out.println("I got interruped");
		}
	}
}

class ThreadDemo {

	public static void main(String[] args){
	
		MyThread obj = new MyThread();
		obj.start();
		System.out.println("End main");

	}
}
