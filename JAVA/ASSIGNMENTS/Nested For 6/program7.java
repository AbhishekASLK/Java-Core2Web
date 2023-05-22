import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the start and end: ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){
			int count=0;
			int x = i;
			while(x%10==0){
				count++;
				x/=10;
			}
			x=i;
			int rev=0;
			while(x!=0){
				int rem = x % 10;
				rev = rem + rev*10;
				x = x / 10;
			}
			for(int j=1;j<=count;j++)
				System.out.print("0");
			System.out.print(rev+" ");
		}

	}
}
