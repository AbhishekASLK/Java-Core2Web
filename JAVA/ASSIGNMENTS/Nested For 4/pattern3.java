class marvel {

	public static void main(String[] args){

		int row=5;
		int x=(row*(row+1))/2;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x--+" ");
			}
			x++;
			System.out.println();
		}
	}
	
	// 10 
	// 10 9
	// 9  8  7
	// 7  6  5  4
}
