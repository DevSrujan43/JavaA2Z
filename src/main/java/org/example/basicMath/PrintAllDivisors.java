package org.example.basicMath;

import java.util.*;

public class PrintAllDivisors {
    // Ex: 12 --> 1, 2, 3, 4, 6, 12
    // 36: 1, 2, 3, 4, 6, 9, 12, 18, 36
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> listOfDiv = new ArrayList<>();
        for(int i=1; i*i <= num; i++) {
            if(num % i == 0) {
                listOfDiv.add(i);
                if(num/i != i) {
                    listOfDiv.add(num/i);
                }
            }
        }

//        Arrays.sort(listOfDiv.toArray());
        Collections.sort(listOfDiv);

        for(int a: listOfDiv) {
            System.out.print(a + " ");
        }
    }
}
