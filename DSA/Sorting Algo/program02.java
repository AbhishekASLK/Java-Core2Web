// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending
// order.

import java.util.Scanner;

class Test {

    public static void sort012(int a[], int n)
    {
        int zero = 0;
        int one = 0;
        int two = 0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                zero++;
            if(a[i]==1)
                one++;
            if(a[i]==2)
                two++;
        }
        int index = 0;
        while(zero!=0){
            a[index] = 0;
            index++;
            zero--;
        }
        while(one!=0){
            a[index]=1;
            index++;
            one--;
        }
        while(two!=0){
            a[index]=2;
            index++;
            two--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sort012(arr, n);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
    }
}