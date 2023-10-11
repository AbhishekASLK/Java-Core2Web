
import java.util.*;

class rangeSumQuery {

	static int[] rangeSumQuery(int[] arr, int n, int[][] query){
	
		int[] res = new int[query.length];

		// [[0,3],[1,2]]

		for(int i=0;i<query.length;i++){
			if(query[i][0] == 0)
				res[i]=arr[query[i][1]];
			else
				res[i]=arr[query[i][1]]-arr[query[i][0]-1];
		}

		return res;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the query count: ");
		int m = sc.nextInt();
		int[][] query = new int[m][2];
		System.out.println("Enter the elements: ");
		for(int i=0;i<m;i++){
			query[i][0]=sc.nextInt();
			query[i][1]=sc.nextInt();
		}

		for(int i=1;i<n;i++){
			arr[i]+=arr[i-1];
		}

		int[] res = rangeSumQuery(arr,n,query);

		for(int x:res){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
