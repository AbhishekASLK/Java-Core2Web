class marvel {

	public static void main(String[] args){
	
		int rows=6;
		for(int i=1;i<=rows;i++){
			char ch = (char)('A'+rows-1);
			int n = rows;
			for(int j=1;j<=rows;j++){
				if(j%2==1)
					System.out.print(ch+" ");
				else
					System.out.print(n+" ");
				ch--;
				n--;
			}
			System.out.println();
		}
	
	}

	// F 5 D 3 B 1
	// F 5 D 3 B 1
	// F 5 D 3 B 1
	// F 5 D 3 B 1
	// F 5 D 3 B 1
	// F 5 D 3 B 1
}
