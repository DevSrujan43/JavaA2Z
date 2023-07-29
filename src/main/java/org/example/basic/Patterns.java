package org.example.basic;

public class Patterns {
    public static void main(String[] args) {
        // pattern 1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern 2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern 3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // pattern 4
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // pattern 5
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 5 - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern 6
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j < 5 - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // pattern 7
        for (int i = 0; i < 6; i++) {
            // space
            for (int j = 0; j < 6 - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < 6 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // pattern 8
        for (int i = 0; i < 6; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 12 - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // pattern 9 is combination of 7 and 8

        // pattern 10
        for(int i=1;i<= 2*4-1;i++){
            int stars = i;
            if(i>4) stars = 8-i;
            for(int j=1;j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern 11
        for(int i=0;i<5;i++){
            int start = 1;
            if(i % 2 == 0) start = 1;
            else start = 0;
            for(int j=0;j<=i;j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }
}
