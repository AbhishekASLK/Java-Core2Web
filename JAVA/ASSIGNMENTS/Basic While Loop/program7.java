class marvel {

	public static void main(String[] args) {
	
		// WAP which takes number from user, if the number is even print that number in reverse order or 
		// if number is odd then print that number in reverse order by difference two.
		int n = 7;
		if(n%2==0){
			while(n>=1){
				System.out.print(n+" ");
				n--;
			}
		}
		else{
			while(n>=1){
				System.out.print(n+" ");
				n=n-2;
			}
		}
		System.out.println();
	}
}
