package com.company;

import java.util.Scanner;

public class Num_till_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to know it's counting till the number you have entered : ");
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
