class marvel {

	public static void main(String[] args){
	
		int rows=4;
		char ch = 'A';
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(j%2==1)
					System.out.print(ch+++" ");
				else
					System.out.print((char)(ch+++32)+" ");	
			}
			System.out.println();
		}
	
	}

	// A b C d
	// E f G h
	// I j K l
	// M n O p
}
