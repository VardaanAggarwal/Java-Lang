package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to know if it is prime or not : ");
        int n = in.nextInt();
        int c = 2;
        if (n<1){
            System.out.println("You have entered an invalid input .");
        } else if (n==1){
            System.out.println("1 is neither prime nor composite . ");
        } else {
            while (c*c<=n){
                if (n%c==0){
                    System.out.println("The number you have entered is a composite number .");
                    break;
                }
                c++;
            }
            if (c*c>n){
                System.out.println("You have entered a prime number .");
            }

        }


    }
}
