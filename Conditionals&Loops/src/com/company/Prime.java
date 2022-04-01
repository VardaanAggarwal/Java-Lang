package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c=2;
            while (c < n) {
                if (n % c == 0) {
                    System.out.println("Composite");
                    break;
                }
                c++;
            }

        if (n==c){
            System.out.println("Prime");
        }

    }
}
