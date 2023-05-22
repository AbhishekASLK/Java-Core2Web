import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		for(int i=end;i>=start;i--){
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
		for(int i=start;i<=end;i++){
			if(i%2==1)
				System.out.print(i+" ");
		}
		System.out.println();

		// WAP to print all even numbers in reverse order and odd numbers in the standard way. Take the start and end from the user
		
		// start: 2
		// end: 9
		
		// output: 8 6 4 2
		//  	   3 5 7 9

	}
}
