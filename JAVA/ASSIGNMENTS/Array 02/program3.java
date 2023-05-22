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

		int oddSum = 0, evenSum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				evenSum+=arr[i];
			else
				oddSum+=arr[i];
		}
	
		System.out.println("Odd Number Sum: "+ oddSum);
		System.out.println("Even Number Sum: "+ evenSum);
	}
}
