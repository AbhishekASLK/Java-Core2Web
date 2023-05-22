import java.io.*;
class marvel {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array-1: ");
		int n1 = Integer.parseInt(br.readLine());

		int arr1[] = new int[n1];

		System.out.println("Enter elements of array-1: ");

		for(int i=0;i<arr1.length;i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter the size of array-2: ");
		int n2 = Integer.parseInt(br.readLine());

		int arr2[] = new int[n2];

		System.out.println("Enter elements of array-1: ");

		for(int i=0;i<arr2.length;i++){
			arr2[i] = Integer.parseInt(br.readLine());
		}

		int size = arr1.length+arr2.length;		
		int arr3[] = new int[size];

		int index = 0;

		for(int i=0;i<arr1.length;i++)
			arr3[index++]=arr1[i];
		for(int i=0;i<arr2.length;i++)
			arr3[index++]=arr2[i];

		// Printing the merged array
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+ " ");
		System.out.println();
	}
}
