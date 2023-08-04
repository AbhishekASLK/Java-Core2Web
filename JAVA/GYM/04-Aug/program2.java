class Test {
	
	public static void main(String[] args){
	
		ThreadGroup g1 = new ThreadGroup("First Group");
		//System.out.println(g.getParent());
		ThreadGroup g2 = new ThreadGroup(g1,"Second Group");
		System.out.println(g2.getParent().getName());
	}

}
