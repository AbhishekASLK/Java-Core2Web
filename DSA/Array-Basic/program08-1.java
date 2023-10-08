// 8] Even occurring elements

// Given an array Arr of N integers that contains an odd number of occurrences for all
// numbers except for a few elements which are present even number of times. Find
// the elements which have even occurrences in the array.

// ========= Version 2.0 ===========

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
            hs.add(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i]))
                hs.remove(arr[i]);
            else
                hs.add(arr[i]);
        }

        if(hs.size()==0)
            return new int[]{-1};
            
        int[] res = new int[hs.size()];
        
        int count=0;

        for (int x : hs) {
            res[count++]=x;
        }

        Arrays.sort(res);
        return res;
    }

}
