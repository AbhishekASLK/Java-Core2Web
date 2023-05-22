class marvel {

	public static void main(String[] args) {
	
		int rows=4;
		int n=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(n+++" ");
			}
			System.out.println();
		}
	}

	// 1
	// 2 3
	// 4 5 6
	// 7 8 9 10
}
