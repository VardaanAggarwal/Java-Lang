package com.company;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        //Q. take input of two numbers and print the sum .

        Scanner in = new Scanner(System.in);
        int num1 , num2 , sum ;
        System.out.print("Please enter the first number : ");
        num1=in.nextInt();
        System.out.print("Please enter the second number : ");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("The sum of the two numbers is " + sum);

    }
}
