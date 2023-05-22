class marvel {

	public static void main(String[] args){
	
		int row=4;
		int x=(row*(row+1))/2;
		char ch=(char)(65+((row*(row+1))/2)-1);
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1)
					System.out.print(x+" ");
				else
					System.out.print(ch+" ");
				x--;
				ch--;
			}
			System.out.println();
		}
	}

	// 10
	// I  H
	// 7  6  5
	// D  C  B  A

}
