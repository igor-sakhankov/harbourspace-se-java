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
