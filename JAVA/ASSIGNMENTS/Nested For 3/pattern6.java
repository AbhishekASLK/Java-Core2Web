class marvel {

	public static void main(String[] args) {
	
		int rows=4;
		for(int i=1;i<=rows;i++){
			int n=(((rows*(rows+1))/2)-1);
			for(int j=1;j<=i;j++){
				System.out.print(n--+" ");
			}
			System.out.println();
		}
	}

	// 9  
	// 9 8
	// 9 8 7
	// 9 8 7 6
}
