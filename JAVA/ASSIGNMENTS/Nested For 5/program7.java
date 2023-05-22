import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row = Integer.parseInt(br.readLine());

		int x = (row*(row+1))/2;
		char ch = (char)(65+x-1);


		
			
		for(int i=1;i<=row;i++){
			if(row%2==1){
				for(int j=1;j<=i;j++){
					if(i%2==1)
						System.out.print(ch+" ");
					else
						System.out.print(x+" ");
					x--;
					ch--;
				}
			}
			else{
				for(int j=1;j<=i;j++){
					if(i%2==0)
						System.out.print(ch+" ");
					else
						System.out.print(x+" ");
					x--;
					ch--;
				}
			}
			System.out.println();
		}

		// O
		// 14  13
		// L   K  J
		// 9   8  7  6
		// E   D  C  B  A
	}
}
