package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print("Enter the the value of n to know nth fibonacci number : ");
        int n = in.nextInt();

        while (count<=n){
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println(b);

    }
}
