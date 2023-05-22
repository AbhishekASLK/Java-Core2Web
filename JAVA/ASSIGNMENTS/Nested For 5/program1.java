import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=row;i++){
			char ch1=(char)(65+row-1);
			int x1=row;
			char ch2=65;
			int x2=1;
			if(i%2==1){
				for(int j=1;j<=row;j++){
					System.out.print(ch1--+""+x1--+" ");
				}
				System.out.println();
			}
			else{
				for(int j=1;j<=row;j++){
					System.out.print(ch2+++""+x2+++" ");
				}
				System.out.println();
			}
		}
		// D4 C3 B2 A1
		// A1 B2 C3 D4
		// D4 C3 B2 A1
		// A1 B2 C3 D4
		
	}
}
