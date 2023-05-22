class marvel {

	public static void main(String[] args) {
	
		// WAP to count the digit of the given number 
		int n = 942111423;
		int count = 0;
		while(n!=0){
			count++;
			n=n/10;
		}
		System.out.println("The count of digit of the given number is "+count);
	}
}
