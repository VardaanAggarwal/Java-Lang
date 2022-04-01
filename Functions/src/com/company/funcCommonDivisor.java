package com.company;

import java.util.Scanner;

public class funcCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = in.nextInt();
        maxCommonDivisor(num1,num2);
    }
    public static void maxCommonDivisor(int num1 , int num2) {
        int conditioner = 0;
        int max = 0;
        if (num1<num2) {
            conditioner = num1;
        } else if (num2<num1) {
            conditioner = num2;
        } else {
            conditioner = num1;
        }
        for (int i = 2; i <= conditioner ; i++) {
            if (num1%i==0 && num2%i==0) {
                if (i>max) {
                    max = i ;
                }
            }
        }
        System.out.println("The Greatest common divisor between the given two number is " + max);
    }
}
