package com.company;

import java.util.Scanner;

public class funcFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number to know its factorial : ");
        int a = in.nextInt();
        factorialOfNumber(a);
    }

    private static void factorialOfNumber(int a) {
        //condition
        if (a<0) {
            System.out.println("The number you have entered is a invalid number . ");
        }
        else if (a==1) {
            System.out.println("The factorial of the number is 1 .");
        }
        else {
            //loop
            int factorial =1 ;
            for (int i = a; i >= 1 ; i--) {
                factorial *= i;
            }
            System.out.println("The factorial of the given number is "+factorial);
        }


    }
}
