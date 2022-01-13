package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*
           Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes
           the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
           Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

           Example 1:

           Input: x = 123
           Output: 321
           Example 2:

           Input: x = -123
           Output: -321
           Example 3:

           Input: x = 120
           Output: 21
         */
        System.out.println(reverse(1534236469));

    }
    public static int reverse(int n){
        int rem=0;
        long rev =0;
        while(n!=0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            return 0;
        }
        else{
            return (int)rev;
        }
    }
}
