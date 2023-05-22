class marvel {

	public static void main(String[] args){
	
		int rows=3;
		int n = 1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(n%2==1)
					System.out.print(n*n+" ");
				else
					System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	
	}

	// 1    2    9
	// 4    25   6
	// 49   8    81
}
