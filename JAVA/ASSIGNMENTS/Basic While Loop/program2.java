class marvel {

	public static void main(String[] args) {
	
		// WAP to calculate the factorial of the given number
		int n = 5;
		int fact = 1;
		while(n>=1){
			fact = fact * n;
			n--;
		}
		System.out.println("The factorial of given number is "+fact);
	}
}
