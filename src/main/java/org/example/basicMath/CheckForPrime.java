package org.example.basicMath;

import java.util.Scanner;

public class CheckForPrime {
    // Prime Number: The number which has 2 factors, that is the number which is divisible by 1 and itself
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i=1;i*i<=num;i++){
            if(num % i == 0) {
                count++;
                if(num / i != i) {
                    count++;
                }
            }
        }
        if(count == 2) {
            System.out.println("Yes, it is prime");
        } else {
            System.out.println("No, it is not prime");
        }

    }
}
