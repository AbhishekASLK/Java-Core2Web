import java.util.*;

class searchInsertPosition {

	static int searchInsertPosition(int[] arr, int n, int target){
		
		int start=0;
		int end=n-1;
		int mid;
		while(start<=end){
			mid=(start+end)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				start=mid+1;
			else
				end=mid-1;
		}
		return start;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter targer: ");
		int target = sc.nextInt();

		System.out.println(searchInsertPosition(arr,n,target));
	}
}
