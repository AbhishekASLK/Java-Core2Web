class marvel {

	public static void main(String[] args) {
	
		int rows=3;
		int n=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(n*n*n+" ");
				n++;
			}
			System.out.println();
		}
	}

	// 1
	// 8  27
	// 64 125 216
}
