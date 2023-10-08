// 2] Find minimum and maximum element in an array

// Given an array A of size N of integers. Your task is to find the minimum and
// maximum elements in the array.

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
        }

		int ans[] = new Provojax().minmax(arr);
        System.out.println(ans[0]+" "+ans[1]);
			
	}

	int[] minmax(int[] arr){

		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        return new int[]{min,max};
	}
}
