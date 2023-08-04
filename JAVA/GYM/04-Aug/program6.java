class Test {

	public static void main(String[] args) {
	
		ThreadGroup tg = new ThreadGroup("TG");
		Thread[] arr = new Thread[4];
		System.out.println(tg.getParent().getParent().enumerate(arr));

		for(Thread x: arr){
			System.out.println(x+" "+x.isDaemon());
		}
	}
}
