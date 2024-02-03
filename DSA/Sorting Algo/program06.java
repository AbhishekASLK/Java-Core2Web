// Given a random set of numbers, Print them in sorted order.

import java.util.Scanner;

class Test {

    static void sortArr(int[] arr, int n) 
    { 
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr){
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        sortArr(arr, n);
        printArray(arr);
        sc.close();
    }
}