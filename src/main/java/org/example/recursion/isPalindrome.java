package org.example.recursion;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "@#madam!";
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean ans = helper(0, str);
        if(ans) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    public static boolean helper(int i, String s) {
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;

        return helper(i+1, s);
    }
}
