class marvel {

	public static void main(String[] args){
	
		int row=4;
		for(int i=1;i<=row;i++){
			int x=i;
			for(int j=1;j<=i;j++){
				System.out.print(x+++" ");
			}
			System.out.println();
		}
	}

	// 1
	// 2 3
	// 3 4 5
	// 4 5 6 7

}
