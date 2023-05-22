import java.util.*;
class marvel {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			int x = arr[i];
			int temp = x;
			int count=0;
			while(temp%10==0){
				count++;
				temp=temp/10;
			}
			int rev=0;
			while(x!=0){
				int rem = x % 10;
				rev = rem + rev*10;
				x = x / 10;
			}
			while(count!=0){
				System.out.print("0");
				count--;
			}
			System.out.print(rev+" ");
		}
		System.out.println();
	}
}
