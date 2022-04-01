package com.company;

import java.util.Scanner;

public class funcAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter second number : ");
        int num2 = in.nextInt();
        System.out.print("Enter third number : ");
        int num3 = in.nextInt();

        System.out.println("The average of the given three numbers is " + Average(num1,num2,num3));

    }

    public static int Average(int a , int b , int c ){
        return (a+b+c)/2;
    }
}
