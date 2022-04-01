package com.company;

import java.util.Scanner;

public class funcArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to know if it is a prime number or not : ");
        int num = in.nextInt();
        armstrong(num);
    }
    public static void armstrong(int num) {
        int rem , arm=0 , originalNumber = num ;
        while (num > 0) {
            rem = num%10;
            arm = arm + rem*rem*rem ;
            num = num/10;
        }
        if (originalNumber == arm)
            System.out.println("The given number is an armstrong number .");
        else
            System.out.println("The given number is not an armstrong number . ");
    }
}
