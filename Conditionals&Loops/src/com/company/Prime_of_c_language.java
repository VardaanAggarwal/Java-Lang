package com.company;

import java.util.Scanner;

public class Prime_of_c_language {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i , n , c=0 ;
        System.out.println("Enter any number n : ");
        n = in.nextInt();
        //logic
        for (i = 1; i <= n ; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 2) {
            System.out.println("n is a prime number .");
        }
        else {
            System.out.println("n is not a Prime number");
        }
    }
}
