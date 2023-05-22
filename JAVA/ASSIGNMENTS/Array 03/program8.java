import java.util.*;
class marvel {

	static int findArmstrongNumber(int[] arr){
		for(int i=0;i<arr.length;i++){
			int x = arr[i];
			int digit=0;
			int sum=0;
			while(x!=0){
				digit++;
				x = x / 10;
			}
			x = arr[i];
			while(x!=0){
				int rem = x % 10;
				int prod=1;
				for(int j=1;j<=digit;j++){
					prod=prod*rem;
				}
				sum+=prod;
				x = x / 10;
			}
			if(sum==arr[i])
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
		int index = findArmstrongNumber(arr);
		if(index>=0)
			System.out.println("Armstrong number "+arr[index]+" found at index "+index);
		else
			System.out.println("Armstrong number not found");
	}
}

