import java.util.*;
class marvel {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		String arr[] = new String[n];

		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.next();
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i].length()+" ");
		}
		System.out.println();
	}
}
