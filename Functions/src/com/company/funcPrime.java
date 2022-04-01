package com.company;

import java.util.Scanner;

public class funcPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b ; i++) {
            if (prime(a)) {
                System.out.println(a+" is a prime number . ");
            }
        }
    }

    public static boolean prime(int a) {
        int i=2 ;
        if (a==0){
            return false;
        }
        else if (a==1){
            return false;
        }
        else if (a>1){
            for ( ; i*i < a ; i++) {
                if (a%i==0){
                    return false;
                }
            }

        }
        if (i*i>a){
            return true;
        }
        return false;
    }
}
