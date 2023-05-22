class marvel {

	public static void main(String[] args) {
	
		// WAP to print the square of even digits of the given number
		int n = 942111423;
		int rem;
		while(n!=0){
			rem=n%10;
			if(rem%2==0)
				System.out.print(rem*rem+" ");
			n=n/10;
		}
		System.out.println();
	}
}
