class marvel {

	public static void main(String[] args){
	
		int rows=3;
		int n = 1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(n*n+" ");
				n++;	
			}
			System.out.println();
		}
	
	}

	// 1  4  9
	// 16 25 36
	// 49 64 81
}
