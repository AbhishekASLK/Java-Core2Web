class marvel {

	public static void main(String[] args) {
	
		// WAP to reverse the given number
		int n = 942111423;
		int rev=0;
		int rem=0;
		while(n!=0){
			rem = n%10;
			rev = rem + rev*10;
			n=n/10;
		}	
		System.out.println(rev);
	}
}
