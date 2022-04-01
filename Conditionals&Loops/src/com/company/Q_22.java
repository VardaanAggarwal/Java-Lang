package com.company;

import java.util.Scanner;
public class Q_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int n = in.nextInt();

        int product = 1;
        int sum = 0;


        while(n>0){
            int rem = n%10;
            n /= 10 ;
            sum += rem ;
            product = product * rem;
        }

        System.out.println(product-sum);

    }
}
