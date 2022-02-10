package com.harbour.test;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String xString = Integer.toString(x);
        StringBuilder sb = new StringBuilder();

        sb.append(xString);
        sb.reverse();
        String rev = sb.toString();
        return xString.equals(rev);
    }
}
class Palindrome {
    public static void main(String[] args) {


        final var palindrome = Quiz2.isPalindrome(121212);
        System.out.println(palindrome);
    }
}
