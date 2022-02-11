package com.harbour.test;

public class Solution {

    /**
     * Return true if string presentation of given number is a palindrome and false otherwise
     * <p>
     * Negative numbers are considered non-palindrome
     * <p>
     * The function is thread-safe
     * <p>
     * The time-complexity is linear (depends on number of digits in the number) The space-complexity is linear (depends
     * on number of digits in the number)
     *
     * @param x any rational number
     * @return if the string is a palindrome
     */
    public static boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        String reversed = new StringBuilder(string).reverse()
                                                   .toString();
        return string.equals(reversed);
    }
}
