// Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.

import java.util.Scanner;

class Test {

    static boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = arraySortedOrNot(arr,n);
        if(result)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
        sc.close();
    }
}