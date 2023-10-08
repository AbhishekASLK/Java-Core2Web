// 9] Remove an Element at Specific Index from an Array

// Given an array of a fixed length. The task is to remove an element at a specific
// index from the array.

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[5];
		
		for(int i=0;i<5;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
        int index = Integer.parseInt(br.readLine());

        int[] res = new Provojax().removeElement(arr, index);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
	}

    int[] removeElement(int[] arr, int index){
        int len = arr.length-1;
        int res[] = new int[len];

        int count=0;
        for(int i=0;i<index;i++){
            res[count++]=arr[i];
        }

        for(int i=index+1;i<=len;i++){
            res[count++]=arr[i];
        }

        return res;
    }

}
