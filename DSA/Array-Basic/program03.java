// 3] Largest Element in Array

// Given an array A[] of size n. The task is to find the largest element in it.

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println((new Provojax().largestElement(arr)));
			
	}

	int largestElement(int[] arr){
        
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
}
