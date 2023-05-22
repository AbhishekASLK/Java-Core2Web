import java.util.*;
class marvel {

	static int compositeNumber(int[] arr){
		for(int i=0;i<arr.length;i++){
			int x = arr[i];
			int count=0;
			for(int j=1;j<=x;j++){
				if(x%j==0)
					count++;
			}
			if(count>2)
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
		int index = compositeNumber(arr);
		if(index>=0)
			System.out.println("Composite "+arr[index]+" found at index "+index);
		else
			System.out.println("Composite number not found");
	}
}

