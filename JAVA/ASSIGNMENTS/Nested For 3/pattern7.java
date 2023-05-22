class marvel {

	public static void main(String[] args) {
	
		int rows=6;
		for(int i=1;i<=rows;i++){
			char ch = (char)('A'-i+rows);
			for(int j=1;j<=i;j++){
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
	}

	// F
	// E F
	// D E F
	// C D E F
	// B C D E F
	// A B C D E F
}
