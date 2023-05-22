import java.util.*;
class marvel {

	static int secondMin(int[] arr){

		// ================== Approach 1: ================
	
		/*
		int min = arr[0];
		int minIndex=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
				minIndex=i;
			}
		}
		arr[minIndex]=Integer.MAX_VALUE;
		
		min = arr[0];
		minIndex = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
				minIndex=i;
			}
		}
		return min;
		*/

		// ================== Approach 2: ================
		
		int first,second;
	        first = second = Integer.MAX_VALUE;
        	for (int i=0;i<arr.length;i++) {
      		  
           		if (arr[i] < first) {
                		second = first;
               			first = arr[i];
            		}
 
       			else if (arr[i] < second && arr[i] != first)
                		second = arr[i];
        	}
        	if (second == Integer.MAX_VALUE)
            		System.out.println("There is no second smallest element");
        	else
            		System.out.println("The smallest element is " + first + " and second Smallest" + " element is " + second);
		return second;
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

		int secondMin = secondMin(arr);
	}
}

