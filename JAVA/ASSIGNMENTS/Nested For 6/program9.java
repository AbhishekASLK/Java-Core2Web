import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the start and end: ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){
			int sum=0;
			int x = i;
			while(x!=0){
				int rem = x % 10;
				int prod=1;
				for(int j=1;j<=rem;j++){
					prod=prod*j;
				}
				sum+=prod;
				x/=10;
			}
			if(sum==i)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
