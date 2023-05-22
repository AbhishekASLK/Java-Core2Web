class marvel {

	public static void main(String[] args) {
	
		// WAP to count the odd digits of the given number
		int n = 942111423;
		int count = 0;
		int rem;
		while(n!=0){
			rem = n % 10;
			if(rem%2==1)
				count++;
			n=n/10;
		}
		System.out.println("The count of odd digits of given number is "+count);
	}
}
