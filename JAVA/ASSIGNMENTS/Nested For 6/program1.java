import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the start and end: ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		int count=0;
		for(int i=start;i<=end;i++){
			if(i%5==0 && i%2==0){
				System.out.print(i+" ");	
				count++;
			}
		}
		System.out.println("\nCount: "+count);
	}
}
