// 6] Elements in the Range

// Given an array arr[] containing positive elements. A and B are two numbers
// defining a range. The task is to check if the array contains all elements in the given
// range.

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

		boolean ans = (new Provojax().elementInTheRange(arr,a,b));
        if(ans==true)   
            System.out.println("Yes");
        else    
            System.out.println("No");
			
	}

    boolean elementInTheRange(int[] arr, int a, int b){

        for(int i=a;i<=b;i++){
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i)
                    flag=true;
            }
            if(flag==false)
                return false;
        }
        return true;
    }

}
