package com.company;

import java.util.Scanner;

public class Assignment_Functions_Question13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Prime_between_two_numbers(n,m);
    }
    static void Prime_between_two_numbers(int n , int m){
        int c = 2;
        int ans = 0;
        while (ans<m){
            while (c<n){
                if (n%c==0){
                    break;
                }
                c++;
            }
            if (n%2==1){
                System.out.println("prime");
            }
        }

    }
}
