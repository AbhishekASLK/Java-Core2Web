class marvel {

	public static void main(String[] args){
	
		int rows=4;
		int x = 26;
		char ch = 'Z';
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(j%2==1)
					System.out.print(x--+" ");
				else
					System.out.print(ch--+" ");
			}
			System.out.println();
		}
	
	}

	// 26 Z 25 Y
	// 24 X 23 W
	// 22 V 21 U
	// 20 T 19 S
}
