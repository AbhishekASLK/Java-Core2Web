class MyThread extends Thread {

	MyThread(ThreadGroup g, String name){
		super(g,name);
	}
	
	public void run(){
	
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){}
	}
}

class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {
	
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg,"ChildGroup");

		MyThread t1 = new MyThread(pg,"ChildThread-1");
		MyThread t2 = new MyThread(pg,"ChildThread-2");
		t1.start();
		t2.start();

		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();

		Thread.sleep(10000);

		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}
}
