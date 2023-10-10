import java.util.*;

class timeToEquality {

	static int timeToEquality(int[] arr, int n){
		
		int max = Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		int second = 0;
		for(int i=0;i<n;i++){
			second+=max-arr[i];
		}
		return second;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println(timeToEquality(arr,n));
	}
}
