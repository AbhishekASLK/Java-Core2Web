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
		
		System.out.println("Common Elements: ");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j])
					System.out.print(arr1[i]+" ");
			}
		}
		System.out.println();
	}
}
