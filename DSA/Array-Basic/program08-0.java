// 8] Even occurring elements

// Given an array Arr of N integers that contains an odd number of occurrences for all
// numbers except for a few elements which are present even number of times. Find
// the elements which have even occurrences in the array.

// ========= Version 1.0 ===========

import java.io.*;
import java.util.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
			
        int[] result = new Provojax().evenOccurringElements(arr);

        for (int x : result) {
            System.out.print(x+" ");
        }
        System.out.println();
	}

    int[] evenOccurringElements(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==key){
                    count++;
                }
            }
            if(count%2==0)
                hs.add(key);
        }  
        if(hs.isEmpty())
            return new int[]{-1};     
        int[] res = new int[hs.size()];
        int index=0;
        for (int x : hs) {
            res[index++]=x;
        }
        Arrays.sort(res);
        return res;
    }

}
