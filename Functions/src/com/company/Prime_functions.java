package com.company;

import java.util.Scanner;

public class Prime_functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = n ; i <= m ; i++) {
            if (isPrime(i)) {
                System.out.println(i+" ");
            }

        }
    }

    static boolean isPrime(int n ){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c * c < n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
