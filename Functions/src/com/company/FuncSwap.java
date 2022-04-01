package com.company;

import java.util.Scanner;

public class FuncSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 , num2;
        System.out.print("Enter the first number of your choice : ");
        num1 = in.nextInt();
        System.out.print("Enter the second number of your choice : ");
        num2 = in.nextInt();
        swapFunc(num1 , num2);
    }

    public static void swapFunc(int num1 , int num2) {
        int temp = num1 ;
        num1 = num2;
        num2 = temp;
        System.out.println("The first number is now " + num1 + " .");
        System.out.println("And the second number is now " + num2 + " .");
    }
}
