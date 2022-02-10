package com.harbour.test;

public class Quiz2 {
   /*
    * Returns a boolean indicating whether a number is palindrome or not
    * @param  a an integer
    * @return      a boolean indicating whether param 2 is palindrome or not
    */
   public static boolean isPalindrome(int number) {
       int r;
       int sum = 0;
       int temp;
       int n = number;

       temp = n;
       while(n > 0){
           r = n % 10;
           sum = (sum * 10) + r;
           n /= 10;
       }
       return temp == sum ? true : false;
   }

   /*
    * Checks whether the method isPalindrome qualifies tests or not
   */
   private static void test() {
       int args[] = {121, 123, 321, 111};
       for (int i=0;i<args.length;++i) {
           boolean result = Quiz2.isPalindrome(args[i]);
           if(!result) {
               System.out.println(String.format("Test is failing for %d" , args[i]));
           }
       }
   }
}
