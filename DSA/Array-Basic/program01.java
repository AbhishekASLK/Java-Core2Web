// 1] Search an Element in an array

// Given an integer array and another integer element. The task is to find if the given
// element is present in the array or not.

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int x = Integer.parseInt(br.readLine());

		System.out.println((new Provojax().search(arr, x)));
			
	}

	int search(int[] arr, int x){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
}
