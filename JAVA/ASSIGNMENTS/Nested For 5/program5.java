import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row = Integer.parseInt(br.readLine());

		int n1=0;
		int n2=1;
		int sum=0;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(sum+" ");
				n1=n2;
				n2=sum;
				sum=n1+n2;
			}
			System.out.println();
		}
		
		// 0 
		// 1  1
		// 2  3   5
		// 8  13  21  34
	}
}
