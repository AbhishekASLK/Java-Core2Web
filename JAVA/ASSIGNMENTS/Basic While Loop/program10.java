class marvel {

	public static void main(String[] args) {
	
		// WAP to check whether the number is a Palindrome or not?
		int n = 2332;
		int rev=0;
		int rem=0;
		int temp=n;
		while(n!=0){
			rem=n%10;
			rev=rem+rev*10;
			n=n/10;
		}
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
