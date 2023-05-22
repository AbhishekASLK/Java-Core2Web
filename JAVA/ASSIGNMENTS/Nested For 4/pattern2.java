class marvel {

	public static void main(String[] args){
	
		int row=3;
		for(int i=1;i<=row;i++){
			int x=(i*(i+1))/2;
			for(int j=1;j<=i;j++){
				System.out.print(x+++" ");
			}
			System.out.println();
		}

	}

	// 1
	// 3  4
	// 6  7  8
	// 10 11 12 13
	// 15 16 17 18 19
}
