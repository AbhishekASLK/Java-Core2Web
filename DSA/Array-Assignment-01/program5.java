import java.util.*;

class inplacePrefixSum {

	static void inplacePrefixSum(int[] arr, int n){

		for(int i=1;i<n;i++){
			arr[i]+=arr[i-1];
		}
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		inplacePrefixSum(arr,n);

		for(int x: arr){
			System.out.print(x+ " ");
		}
		System.out.println();
	}
}
