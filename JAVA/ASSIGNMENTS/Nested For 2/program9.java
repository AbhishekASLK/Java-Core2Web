class marvel {

	public static void main(String[] args){
	
		int rows=3;
		int n1 = 1;
		for(int i=1;i<=rows;i++){
			char ch = (char)('A'+rows-1);
			int n2 = rows;
			for(int j=1;j<=rows;j++){
				System.out.print((n1*n1)+""+(ch--)+(n2--)+" ");
				n1++;
			}
			System.out.println();
		}
	
	}

	// 1C3  4B2  9A1
	// 16C3 25B2 36A1
	// 49C3 64B2 81A1
}
