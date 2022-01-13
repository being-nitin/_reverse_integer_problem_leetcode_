package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*
            Reverse an integer with a condition if intervals
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
