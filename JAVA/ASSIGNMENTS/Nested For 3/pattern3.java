class marvel {

	public static void main(String[] args) {
	
		int rows=4;
		int n=(rows*(rows+1))/2;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(n--+" ");
			}
			System.out.println();
		}
	}

	// 10
	// 9  8
	// 7  6  5
	// 4  3  2  1
}
