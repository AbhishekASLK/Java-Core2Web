import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array: ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		System.out.println("Enter elements: ");

		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

		System.out.println(max);
	
	}
}
