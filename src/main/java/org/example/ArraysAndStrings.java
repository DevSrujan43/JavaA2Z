package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndStrings {
    public static void main(String[] args) {
//        System.out.println("Enter numbers :");
//        Scanner sc = new Scanner(System.in);
//        String num = sc.nextLine();
//        String[] nums = num.split(" ");
//        int[] numbers = new int[nums.length];
//        for(int i=0;i<numbers.length;i++) {
//            numbers[i] = Integer.parseInt(nums[i]);
//            System.out.println(numbers[i]);
//        }

//        // Two dimensions array
//        int[][] twoDimensionsArr = {
//                {1,2},
//                {4,3},
//                {8,6},
//                {9,1}
//        };
//        for(int i=0;i<4;i++) {
//            for(int j=0;j<2;j++) {
//                System.out.print(twoDimensionsArr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[] testArrMethods = {12,2,3,12,5,1,19};
        System.out.println(Arrays.toString(testArrMethods));
        Arrays.sort(testArrMethods);
        System.out.println();
        System.out.println(Arrays.copyOfRange(testArrMethods,1,3));

        String s = "Srujan";
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.substring(3));
        System.out.println(s.concat("Patluri"));
        System.out.println(s.indexOf('P'));
        System.out.println(s.lastIndexOf('u'));
        System.out.println(s.equals("srujan"));
        System.out.println("    Tanjiro    ".trim());
        System.out.println(s.contains("ja"));
        char[] arr = s.toCharArray();


    }
}
