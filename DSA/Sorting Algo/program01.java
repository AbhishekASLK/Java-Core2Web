// Given an Integer N and a list arr. Sort the array using bubble sort algorithm.

import java.util.*;

class Test {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Before Sorting: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        bubbleSort(arr);

        System.out.println("After Sorting: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        sc.close();
    }
}