class marvel {

	static marvel m = new marvel();

	static {
	
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Block");
	}

	{
		int x = 20;
		System.out.println(x);
	}

	marvel() {
	
		System.out.println("Constructor");
	}

	public static void  main(String[] args) {
		System.out.println("Hello World!");
	}
}
