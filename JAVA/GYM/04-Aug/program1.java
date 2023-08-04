class Test {
	
	public static void main(String[] args){
	
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	}

}
