import java.util.*;

class minMaxSum {

	static int minMaxSum(int[] arr, int n){
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			if(arr[i]<min)
				min = arr[i];
			if(arr[i]>max)
				max = arr[i];
		}

		return max+min;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
	
		System.out.println(minMaxSum(arr,n));
	}
}
