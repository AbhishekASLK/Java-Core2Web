// 5] Replace all 0's with 5

// You are given an integer N. You need to convert all zeros of N to 5.

import java.io.*;

class Provojax {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		System.out.println(new Provojax().replace0with5(n));
	}

	int replace0with5(int n){
        int rev = 0;
		while(n!=0){
            int rem = n%10;
            if(rem==0)
                rem=5;
            rev = rem + rev*10;
            n=n/10;
        }
        rev = reverse(rev);
        return rev;
	}

    int reverse(int n){
        int rev=0;
        while(n!=0){
            rev = n%10 + rev*10;
            n=n/10;
        }
        return rev;
    }
}
