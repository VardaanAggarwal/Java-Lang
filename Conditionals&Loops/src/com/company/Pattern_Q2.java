package com.company;

import java.util.Scanner;

public class Pattern_Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = in.nextInt();
        System.out.print("Enter the number of columns : ");
        int m = in.nextInt();
        System.out.println("It is only going to print the boundaries of the block . ");
        for (int i = 1 ; i<=n ; i++) {
            for (int j = 1 ; j<=m ; j++) {
                if ( i == 1 || j == 1 || i == n || j == m ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
