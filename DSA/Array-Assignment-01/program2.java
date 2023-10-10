import java.util.*;

class linearSearch {

	static int linearSearch(int[] arr, int n, int x){
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i]==x)
				count++;
		}
		return count;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(linearSearch(arr,n,x));
	}
}
