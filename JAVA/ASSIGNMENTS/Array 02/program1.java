import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array: ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		int sum = 0;

		System.out.println("Enter elements: ");

		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
			sum+=arr[i];
		}

		System.out.println(sum);

	}
}
