package com.company;

import java.util.Scanner;

public class funcMaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number of your choice : ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number of your choice : ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number of your choice : ");
        int num3 = in.nextInt();

        int max = Max(num1,num2,num3);
        int min = Min(num1,num2,num3);
        System.out.println("The Maximum out of the given three numbers is " + max + " and the minimum number out of the given three numbers is " + min + " . ");

    }
    public static int Min(int num1 , int num2 , int num3) {
        int min = 0;
        if (num1>min) {
            min = num1;
        } if (num2<min) {
            min = num2;
        } if (num3<min) {
            min = num3;
        }
        return min;
    }
    public static int Max(int num1 , int num2 , int num3) {
        int max = 0;
        if (num1>max) {
            max = num1;
        } if (num2>max) {
            max = num2;
        } if (num3>max) {
            max = num3;
        }
        return max;
    }
}
