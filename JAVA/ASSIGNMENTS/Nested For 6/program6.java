import java.io.*;
class marvel {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the five numbers: ");
		for(int i=1;i<=5;i++){
			int n = Integer.parseInt(br.readLine());
			int temp = n;
			int count=0;
			while(temp!=0){
				count++;
				temp/=10;
			}
			System.out.println("The digit count in "+n+" is "+count);
		}
	}
}
