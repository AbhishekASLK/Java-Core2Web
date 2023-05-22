import java.util.*;
class marvel {

	static int secondMax(int[] arr){

		// ================== Approach 1: ================
	
		/*
		int max = arr[0];
		int maxIndex=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				maxIndex=i;
			}
		}
		arr[maxIndex]=Integer.MIN_VALUE;
		
		max = arr[0];
		maxIndex = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				maxIndex=i;
			}
		}
		return max;
		*/

		// ================== Approach 2: ================

		int max = arr[0];
		int secondMax=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				secondMax = max;
				max = arr[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		int secondMax = secondMax(arr);
		System.out.println("Second max element: "+secondMax);
	}
}

