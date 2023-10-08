// 7] Form largest number from digits

// Given an array of numbers from 0 to 9 of size N. Your task is to rearrange elements
// of the array such that after combining all the elements of the array, the number
// formed is maximum.

import java.io.*;
import java.util.Arrays;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
			
        System.out.println(new Provojax().largestNumber(arr));
	}

    long largestNumber(int[] arr){

        Arrays.sort(arr);
        long n = 0;
        for(int i=0;i<arr.length;i++){
            int pow = 1;
            for(int j=0;j<i;j++){
                pow*=10;
            }
            n += arr[i]*pow;
        }
        return n;
    }

}
