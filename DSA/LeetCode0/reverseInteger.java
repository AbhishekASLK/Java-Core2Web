import java.util.*;

class reverseInteger {

	static int reverseInteger(int n){
		int rev=0;
		while(n!=0){
			if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
				return 0;
			rev = n%10+rev*10;
			n/=10;
		}
		return rev;
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverseInteger(n));
	}
}
