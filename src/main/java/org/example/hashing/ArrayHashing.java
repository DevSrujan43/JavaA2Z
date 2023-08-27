package org.example.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHashing {
    public static void main(String[] args) {
        int[] resultedArr = helper(6, 9, new int[]{1,2,3,6,1,3});
        for(int i=0;i<resultedArr.length;i++) {
            System.out.print(resultedArr[i] + " ");
        }
//        int si;
//        Scanner sc = new Scanner(System.in);
//        si = sc.nextInt();
//        int arr[] = new int[si];
//        for(int i=0;i<si;i++) {
//            Scanner sc1 = new Scanner(System.in);
//            arr[i] = sc1.nextInt();
//        }
//
//        //precompute
////        int hashArr[] = new int[12];
////        Arrays.fill(hashArr, 0);
////        for(int i=0;i<si;i++) {
////            hashArr[arr[i]] += 1;
////        }
//
//        int q;
//        q = sc.nextInt();
//        while(q>0) {
//            int number;
//            number = sc.nextInt();
//
////            System.out.println(hashArr[number] + " ");
//            q--;
//        }
//        int[] arr = new int[4];
//        for(int i=0;i<4;i++) {
//            System.out.println(arr[i]);
//        }
    }

    public static int[] helper(int n, int x, int[] nums) {
        int hashArr[] = new int[x+1];

        for(int i=0;i<n;i++) {
            hashArr[nums[i]] += 1;
        }

        return Arrays.copyOfRange(hashArr, 1, n+1);
    }
}
