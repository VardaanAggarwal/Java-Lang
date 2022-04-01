package com.company;

import java.util.Scanner;

public class funcMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = in.nextInt();
        System.out.println("The maximum of the given two numbers is " + maxi(num1,num2));
    }

    private static int maxi(int num1, int num2) {
        int max=0;
        if (num1>max){
            max=num1;
        }
        if (num2>num1) {
            max=num2;
        }
        return max;
    }
}
