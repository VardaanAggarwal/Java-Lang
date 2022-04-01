package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int num = 194 , sum=0;
        for (int i = 0; i < 3; i++) {
            int aloo = num%10;
            sum += aloo;
            num = num/10;
        }
        System.out.println(sum);
    }
}