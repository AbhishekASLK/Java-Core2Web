class marvel {

	public static void main(String[] args){
	
		int row=4;
		int i=1;
		char ch=65+i-1;
		for(;i<=row;i++){
			ch = (char)(65+i-1);
			for(int j=1;j<=(row-i+1);j++){
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
		
	}

	// A B C D
	// B C D
	// C D
	// D
}
