class marvel {

	public static void main(String[] args) {
	
		// WAP to print the sum of all even numbers and multiplication of odd numbers between 1 to 10
		int n = 1;
		int sum = 0;
		int prod = 1;
		while(n<=10){
			if(n%2==0)
				sum+=n;
			else
				prod*=n;
			n++;
		}
		System.out.println("Sum of even numbers: "+sum);
		System.out.println("Product of odd numbers: "+prod);
	}
}
