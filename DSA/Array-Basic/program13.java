// 13] Find unique element

// Given an array of size n which contains all elements occurring in multiples of K,
// except one element which doesn't occur in multiple of K. Find that unique element.

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

        System.out.println(new Provojax().uniqueElement(arr,k));
	}

    int uniqueElement(int[] arr,int k){

        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count%k!=0)
                return key;
        }
        return -1;
    }

}
