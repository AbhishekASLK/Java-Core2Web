import java.io.*;
class marvel {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[10];

		System.out.println("Enter the 10 elements of array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
