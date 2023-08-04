class Test {

	public static void main(String[] args) {
	
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		
		Thread[] arr = new Thread[system.activeCount()];
	
		system.enumerate(arr);

		for(Thread t: arr)
			System.out.println(t+" "+t.isDaemon());
		
	}
}
