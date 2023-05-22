class marvel {

	static {
		System.out.println("In Static Block");
	}

	static marvel m = new marvel();

	{
		System.out.println("In Instance Block");
	}

	{
		int x = 20;		
		System.out.println(x);
	}

	marvel(){
		System.out.println("In Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
