import java.util.*;

class leadersInArray {

	static ArrayList<Integer> leadersInArray(int[] arr, int n){

		ArrayList<Integer> res = new ArrayList<>();
	
		for(int i=0;i<n-1;i++){
			boolean flag = false;
			for(int j=i+1;j<n;j++){
				if(arr[i]<arr[j])
					flag=true;		
			}
			if(flag==false)
				res.add(arr[i]);
		}
		res.add(arr[n-1]);
		return res;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		ArrayList<Integer> res = leadersInArray(arr,n);

		for(int x: res){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
