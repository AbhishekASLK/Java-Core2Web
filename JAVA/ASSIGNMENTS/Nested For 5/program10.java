import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start: ");
		int s = Integer.parseInt(br.readLine());

		System.out.println("Enter end: ");
		int e = Integer.parseInt(br.readLine());
	
		for(int i=s;i<=e;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
