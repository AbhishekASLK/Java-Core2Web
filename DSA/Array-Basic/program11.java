// 11] Product of maximum in first array and minimum in second

// Given two arrays of A and B respectively of sizes N1 and N2, the task is to
// calculate the product of the maximum element of the first array and minimum
// element of the second array.

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n1];
		
		for(int i=0;i<n1;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}

        int n2 = Integer.parseInt(br.readLine());
		int[] arr2 = new int[n2];
		
		for(int i=0;i<n2;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
        
        System.out.println(new Provojax().product(arr1, arr2));
	}

    long product(int[] arr1, int[] arr2){

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max)
                max=arr1[i];
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<min)
                min=arr2[i];
        }

        return max*min;
    }

}
