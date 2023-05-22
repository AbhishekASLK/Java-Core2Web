class marvel {

	public static void main(String[] args){
	
		for(int i=1;i<=4;i++){
			int temp=i;
			for(int j=1;j<=4;j++){
				System.out.print(i+++" ");
			}
			System.out.println();
			i=temp;
		}
	
	}

	// 1 2 3 4
	// 2 3 4 5
	// 3 4 5 6 
	// 4 5 6 7
}
