import java.util.*;
class marvel {

	static int findPerfectNumber(int[] arr){
		for(int i=0;i<arr.length;i++){
			int x = arr[i];
			int sum=0;
			for(int j=1;j<x;j++){
				if(x%j==0)
					sum+=j;
			}
			if(sum==x)
				return i;
		}
		return -1;
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
		int index = findPerfectNumber(arr);
		if(index>=0)
			System.out.println("Perfect number "+arr[index]+" found at index "+index);
		else
			System.out.println("Perfect number not found");
	}
}

