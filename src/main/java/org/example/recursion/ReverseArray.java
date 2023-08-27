package org.example.recursion;

public class ReverseArray {
    public static void main(String[] args) {
       int[] reverseArr =  reverseArray(5, new int[]{1, 2, 3, 4, 5});
       for(int i=0;i<reverseArr.length;i++) {
           System.out.print(reverseArr[i] + " ");
       }
    }

    public static int[] reverseArray(int n, int []nums) {
        helper(nums, 0, nums.length-1);
        return nums;
    }

    public static void helper(int[] arr, int i, int j) {
        if(i>=j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        helper(arr,i+1,j-1);
    }
}
