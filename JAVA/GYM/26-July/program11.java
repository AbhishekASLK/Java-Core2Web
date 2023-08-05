
class MyThread extends Thread {
	
	public void run(){

		try{
			this.sleep(4000);
		}
		catch(InterruptedException ie){
		}
		System.out.println("hello");
	}
}


class Test {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread obj = new MyThread();
		obj.start();	
		
		System.out.println(obj);
		obj.sleep(2000);

		System.out.println(obj.getThreadGroup());
	}
}
