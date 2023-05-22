class marvel {

	public static void main(String[] args) {
	
		int rows=4;
		char ch = (char)('A'+((rows*(rows+1))/2)-1);
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch--+" ");
			}
			System.out.println();
		}
	}

	// J
	// I H
	// G F E
	// D C B A
}
