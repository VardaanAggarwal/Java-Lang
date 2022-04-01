package com.company;

import java.util.Scanner;

public class funcPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int power = in.nextInt();
        Power(number , power);

    }
    public static void Power(int number , int power) {
        double ans = Math.pow(number, power);
        System.out.println("The ans of the given number is : " + ans);
    }
}
