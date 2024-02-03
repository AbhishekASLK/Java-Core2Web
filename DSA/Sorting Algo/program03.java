/* Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order.
// Merge them in sorted order without using any extra space. Modify arr1 so that it
// contains the first N elements and modify arr2 so that it contains the last M
// elements. */

import java.util.*;

class Test {

	public static void sort(int[] arr1, int[] arr2, int n, int m){
		
		int[] result = new int[n+m];

		int index = 0;
		for(int i=0;i<n;i++){
			result[index]=arr1[i];
			index++;
		}
		for(int i=0;i<m;i++){
			result[index]=arr2[i];
			index++;
		}
		int len = n+m;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-i-1;j++){
				if(result[j]>result[j+1]){
					int temp = result[j];
					result[j] = result[j+1];
					result[j+1] = temp;
				}
			}
		}
		index = 0;
		for(int i=0;i<n;i++){
			arr1[i] = result[index];
			index++;
		
		}
		for(int i=0;i<m;i++){
			arr2[i] = result[index];
			index++;
		}
	}
	static void printArray(int[] arr){
		for(int x: arr){
			System.out.print(x+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Input of arr1
		System.out.println("Enter the length of arr1: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter the element of arr1: ");
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();

		// Input of arr2
		System.out.println("Enter the length of arr2: ");
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		System.out.println("Enter the element of arr2: ");
		for(int i=0;i<m;i++)
			arr2[i]=sc.nextInt();
		
		System.out.println("arr1: ");
		printArray(arr1);
		System.out.println("arr2: ");
		printArray(arr2);

		sort(arr1,arr2,n,m);
		
		System.out.println("After sorting: ");

		System.out.println("arr1: ");
		printArray(arr1);
		System.out.println("arr2: ");
		printArray(arr2);
        sc.close();
	}
}
