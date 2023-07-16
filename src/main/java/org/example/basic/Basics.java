package org.example.basic;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // Primitive dataTypes: Boolean, char, byte, short, int, long, float and double
        // Non-Primitive dataTypes:
        int i = 0;
        short s = 12;
        char c = 's';
        long l = 1000L;
        float f = 23.1f;
        double d = 1231.1;
        boolean b = true;
        String string = "Srujan";
//        System.out.println(string.equalsIgnoreCase("Srujan"));
//        Scanner scanner  = new Scanner(System.in);
//        int someNumber = scanner.nextInt();
//        char ch = scanner.next().charAt(0);
//
//        if(Character.isUpperCase(ch)) {
//            System.out.println(1);
//        } else if (Character.isLowerCase(ch)) {
//            System.out.println(0);
//        } else if (!Character.isAlphabetic(ch)){
//            System.out.println(-1);
//        }
//
//        if (i > 1) {
//            System.out.println("Number is greater than 1");
//        } else {
//            System.out.println("Number is something");
//        }

//        String ans = (someNumber > 1) ? "Yes" : "no";
//        System.out.println(ans);


//        int value = 10;
//        do {
//            System.out.println(value);
//            value--;
//        } while (value > 0);

        Mobile mobile = new Mobile();
        mobile.brand = "IPhone";
        mobile.modelName = "IPhone 14 Pro";
        mobile.type = "SmartPhone";

        Mobile mobile1 = new Mobile();
        mobile1.brand = "IPhone";
        mobile1.modelName = "IPhone 15 Pro";


//        System.out.println(mobile.type);
//        System.out.println(mobile1.type);
        mobile1.type = "FoldedPhone ";

//        System.out.println(Integer.SIZE/8);
//        System.out.println(Character.SIZE/8);

    }
}
