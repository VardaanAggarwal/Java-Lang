package com.company;

import java.util.Scanner;

public class funcFibonacchi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms that you want to display on the screen : ");
        int terms = in.nextInt();
        Fibonacci(terms);
    }

    public static void Fibonacci(int terms) {
        int a = 0;
        int b = 1;
        int num1 = a;
        int num2 = b;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3 ; i <= terms ; i++) {
            int temp = b;
            b = b+a;
            a = temp;
            System.out.print(b + " ");
        }
    }
}
