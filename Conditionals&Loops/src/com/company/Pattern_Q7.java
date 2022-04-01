package com.company;

import java.util.Scanner;

public class Pattern_Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = in.nextInt();
        for (int i = 1; i <= n ; i++) {
            int spaces = n-i;
            for (int j = 1; j <= spaces ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
