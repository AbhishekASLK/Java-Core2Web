// 14] Maximum repeating number

// Given an array Arr of size N, the array contains numbers in range from 0 to K-1
// where K is a positive integer and K <= N. Find the maximum repeating number in
// this array. If there are two or more maximum repeating numbers return the element
// having least value.

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		int k = Integer.parseInt(br.readLine());

		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

        System.out.println(new Provojax().maxRepeatingNumber(arr,k));
	}

    int maxRepeatingNumber(int[] arr,int k){
        return 0;
    }

}
