package com.company;

import java.util.Scanner;

public class Prime_using_while_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = in.nextInt();
        int i=1 , c=0 ;
        while(i<=n){
            if (n%i==0){
                c++;
            }
            i++;
        }
        if(c==2){
            System.out.println("n is a prime number .");
        }
        else{
            System.out.println("n is a composite number .");
        }

    }
}
