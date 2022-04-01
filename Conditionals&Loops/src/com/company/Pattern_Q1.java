package com.company;

import java.util.Scanner;

public class Pattern_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = in.nextInt();
        System.out.print("Enter the number of columns : ");
        int m = in.nextInt();
        for (int i = 1 ; i<=n ; i++) {
            for (int j = 1 ; j<=m ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
