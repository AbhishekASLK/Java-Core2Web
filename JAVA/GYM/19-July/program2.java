
class MyThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		/*for(int i=0;i<10;i++) {
			System.out.println("In run");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}*/
	}

	public void fun(){
	
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hello World!");
	}
}

class Test {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println(Thread.currentThread().getName());
		MyThread obj = new MyThread();
		obj.start();

		/*for(int i=0;i<10;i++){
			System.out.println("In main");
			Thread.sleep(1000);
		}*/

		obj.fun();
	}
}
