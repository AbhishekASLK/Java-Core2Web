// 12] First and last occurrences of X

// Given a sorted array having N elements, find the indices of the first and last
// occurrences of an element X in the given array.
// Note: If the number X is not found in the array, return '-1' as an array.

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
        
        int[] res = new Provojax().firstAndLastOccurrence(arr, x);

        if(res.length==2)
            System.out.println(res[0]+" "+res[1]);
        else
            System.out.println(res[0]);
	}

    int[] firstAndLastOccurrence(int[] arr, int x){
        int first=-1;
        int last=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                first=i;
                break;
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                last=i;
                break;
            }
        }
        
        if(first==-1 || last==-1)
            return new int[]{-1};

        return new int[]{first,last};
    }

}
