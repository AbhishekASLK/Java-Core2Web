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

		for(int i=0;i<arr.length;i++){
			int x=arr[i];
			int sum=0;
			while(x!=0){
				int rem=x%10;
				sum+=rem;
				x=x/10;
			}
			if(sum%2==0)
				System.out.print(arr[i]+" ");
		}

		System.out.println();

	}
}
