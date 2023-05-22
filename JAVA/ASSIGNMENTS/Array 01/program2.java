import java.io.*;
class marvel {

	public static void main(String[] args) throws IOException{
	
		// WAP to take size of array from user and also take integer elements from user, print product of even elements only
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array: ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int prod = 1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				prod*=arr[i];
		}
		System.out.println(prod);
	}
}
