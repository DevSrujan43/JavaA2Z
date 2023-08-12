package org.example.recursion;

public class NToOneWithoutLoop {
    public static void main(String[] args) {
        int arr[] = printNos(5);
        for(int i : arr) {
            System.out.print(i);
        }
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr = new int[x];
        return printReverse(1,arr,x);
    }

    public static int[] printReverse(int i, int[] arr, int x) {
        if(i > arr.length) {
            return arr;
        }

        arr[i-1] = x;
        return printReverse(i+1, arr, x-1);
    }
}
