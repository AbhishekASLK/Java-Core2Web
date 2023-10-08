import java.util.*;

class twoSum {

	static int[] twoSum(int[] arr, int n, int target){
	
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]+arr[j]==target)
					return new int[]{i,j};
			}
		}
		return new int[]{-1,-1};
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		System.out.println("Enter target: ");
		int target = sc.nextInt();

		int[] res = twoSum(arr,n,target);

		for(int x:res){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
