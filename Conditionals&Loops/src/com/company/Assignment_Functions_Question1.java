package com.company;

import java.util.Scanner;

public class Assignment_Functions_Question1 {
    static int a , b , c , max = 0 , min = 0 ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = in.nextInt();
        System.out.print("Enter the second number : ");
        b = in.nextInt();
        System.out.print("Enter the third number : ");
        c = in.nextInt();
        int maxi = maximum(a,b,c);
        System.out.println("The maximum of the three numbers is "+maxi);

        int mini = minimum(a,b,c);
        System.out.println("The minimum of the three numbers is "+mini);
    }
    static int maximum(int a , int b , int c ) {

        if (a>max) {
            max=a;
        }
        if (b>max) {
            max=b;
        }
        if (c>max){
            max=c;
        }
        return max;
    }

    static int minimum(int a , int b , int c) {
        if (a>min) {
            min=a;
        }
        if (b<min) {
            min=b;
        }
        if (c<min){
            min=c;
        }
        return min;
    }
}
