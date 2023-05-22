import java.util.*;
class marvel {

	static int findPalindromeNumber(int[] arr){
		for(int i=0;i<arr.length;i++){
			int x = arr[i];
			int rev=0;
			while(x!=0){
				int rem = x % 10;
				rev = rem + rev*10;
				x = x / 10;
			}
			if(rev==arr[i])
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
		int index = findPalindromeNumber(arr);
		if(index>=0)
			System.out.println("Palindrome number "+arr[index]+" found at index "+index);
		else
			System.out.println("Palindrome number not found");
	}
}

