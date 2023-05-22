import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int sum = 0;
		while(n!=0){
			int rem=n%10;
			int prod=1;
			for(int i=1;i<=rem;i++){
				prod=prod*i;
			}
			sum+=prod;
			n=n/10;
		}
		System.out.println(sum);
		// WAP to print addition of factorial of each digit from the number
	}
}
