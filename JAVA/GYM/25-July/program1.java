
class MyThread extends Thread {

	MyThread(String str){
		super(str);
	}

	MyThread(){
	
	}

	public void run(){
		System.out.println(getName());
	}

}

class ThreadDemo {

	public static void main(String[] args) {

		MyThread obj1 = new MyThread("XYZ");
		obj1.start();

		MyThread obj2 = new MyThread("PQR");
		obj2.start();

		MyThread obj3 = new MyThread("PQR");
		obj3.start();

		MyThread obj4 = new MyThread("PQR");
		obj4.start();

		MyThread obj5 = new MyThread();
		obj5.destroy();
	}
}
