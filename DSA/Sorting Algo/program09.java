import java.util.*;

class Test {

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                list.add(i);
        }
        return list;
    }

    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        printArray(arr);
        List<Integer> result = targetIndices(arr,target);
        for (Integer integer : result) {
            System.out.print(integer+ " ");
        }
        System.out.println();
        sc.close();
    }
}