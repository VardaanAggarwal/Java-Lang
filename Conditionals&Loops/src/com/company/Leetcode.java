package com.company;

public class Leetcode {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {

        int rem=0 , ans=0   ;
        int ref=x;
        while (x>0){
            rem = x%10;
            x /= 10;
            ans = ans*10 + rem;
        }

        return ref==ans;

    }
}
