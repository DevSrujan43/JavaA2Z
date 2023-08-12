package org.example.recursion;

public class OneToNWithoutLoop {
    public static void main(String[] args) {
        int arr[] = printNos(5);
        for(int i : arr) {
            System.out.print(i);
        }
    }
    public static int[] printNos(int x) {
        int[] arr = new int[x];

        return print1ToN(arr, x);
    }

    static int[] print1ToN(int[] arr, int x) {
        if(x == 0) {
            return arr;
        }

        arr[x-1] = x;
        return print1ToN(arr, x-1);
    }
}
