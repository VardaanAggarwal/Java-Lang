package com.company;

import java.util.Scanner;

public class IntExample {
    public static void main(String[] args) {
        sum();
        sum();
        sum();
        int ans = sum2(11,13);
        System.out.println();
    }

    static int sum2(int a , int b) {
        a = 10 ;
        b = 20 ;
        int sum = a+b;
        return sum;
    }

    //return the value

    static void sum() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=in.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The sum of the 2 numbers is "+sum+" . ");

    }

}
