package com.company;

import java.util.Scanner;

public class funcMultiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = in.nextInt();
        System.out.println("Enter the second number : ");
        int b = in.nextInt();
        int multiply = multiplyTwoNumbers(a,b);
        System.out.println("The multiplication of the given two numbers is : "+multiply);
    }

    private static int multiplyTwoNumbers(int a, int b) {
        int multiply = a*b;
        return multiply;
    }
}
