// 4] Product of array elements

// This is a functional problem. Your task is to return the product of array elements
// under a given modulo.
// The modulo operation finds the remainder after the division of one number by
// another. For example, K(mod(m))=K%m= remainder obtained when K is divided
// by m

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println((new Provojax().product(arr)));
			
	}

	long product(int[] arr){
        
		long prod = 1;
		for(int i=0;i<arr.length;i++){
			prod = (prod * arr[i])%10000007;
		}
		return prod;
	}
}
