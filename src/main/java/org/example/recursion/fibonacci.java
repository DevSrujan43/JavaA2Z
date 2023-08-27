package org.example.recursion;

public class fibonacci {
    public static void main(String[] args) {
        int value = fib(4);
        System.out.println(value);
    }

    public static int fib(int i) {
        if(i <= 1) return i;
        return fib(i-1) + fib(i-2);
    }
}
