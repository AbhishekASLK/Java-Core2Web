
class MyThread extends Thread {
	
}


class Test {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread obj = new MyThread();
		obj.start();	
		
		// Main thread ला झोपावल तो पर्यंत MyThread च काम झाल आणि terminate झाला! So ThreadGroup मध्ये फक्त active threads च असतात, ते death 💀 threads च count ठेवत नाही! जेव्हाही thread terminate होतो, तेव्हा तो कोणत्याही ThreadGroup चा part राहत नाही!
		
		Thread.currentThread().sleep(2000);	 

		System.out.println(obj.getThreadGroup());
		System.out.println(obj);
	}
}
