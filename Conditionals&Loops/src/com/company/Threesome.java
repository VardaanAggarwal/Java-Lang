package com.company;

import java.util.Scanner;

public class Threesome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while (true){
            System.out.println("Please enter a number : ");
            int n = in.nextInt();
            if (max<n){
                max = n;
            } else if (n==0){
                break;
            }
        }
        System.out.println(max);
    }
}
