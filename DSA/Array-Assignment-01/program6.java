import java.util.*;

class productArrayPuzzle {

	static long[] productArrayPuzzle(int[] nums, int n) {
		
		// [1,2,3,4,5]
		// [120,60,40,30,24]

		long[] arr = new long[n];
        
        	long prod = 1;
        	int count=0;
        	boolean flag=false;
        	for(int i=0;i<n;i++){
            		if(nums[i]==0){
                		flag=true;
                		count++;
            		}
           		else {
                		prod*=nums[i];
      			}
        	}

        	if(count>=2)
           		return new long[n];
            
        	for(int i=0;i<n;i++){
            		if(flag==true && nums[i]!=0)
                		arr[i]=0;
            		else if(nums[i]!=0)
                		arr[i]=prod/nums[i];
            		else
                		arr[i]=prod;
        	}
        	
		return arr;

	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		long[] res = productArrayPuzzle(arr,n);

		for(long x:res){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
