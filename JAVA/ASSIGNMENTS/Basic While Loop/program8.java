class marvel {

	public static void main(String[] args) {
	
		// WAP to print the countdown of days to submit the assignment
		int days = 7;
		while(days>=0){
			if(days==0)
				System.out.println(days+" days assignment is overdue");
			else
				System.out.println(days+" days remaining");
			days--;
		}
	}
}
