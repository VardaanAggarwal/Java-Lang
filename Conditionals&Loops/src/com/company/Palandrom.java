package com.company;

import java.util.Scanner;

public class Palandrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number to check if it is a palandrom or not : ");
        int rem , ans=0 , num ;
        num = in.nextInt();
        int ref=num;
        while (num>0){
            rem = num%10;
            num /= 10;
            ans = ans*10 + rem;
        }
        if (ans==ref){
            System.out.println("Palandrom . ");
        } else {
            System.out.println("not Palandrom . ");
        }


    }
}
